from typing import SupportsFloat, Any, List

import gymnasium as gym
import numpy as np
from gymnasium.core import WrapperActType, WrapperObsType

import mydojo
from models.dqn import DQNSoundAgent
from mydojo.minecraft import int_to_action

sound_list = [
    "subtitles.entity.sheep.ambient",  # sheep ambient sound
    "subtitles.block.generic.footsteps",  # player, animal walking
    "subtitles.block.generic.break",  # sheep eating grass
    "subtitles.entity.cow.ambient",  # cow ambient sound
    "subtitles.entity.pig.ambient",  # pig ambient sound
    "subtitles.entity.chicken.ambient",  # chicken ambient sound
    "subtitles.entity.chicken.egg",  # chicken egg sound
]


def encode_sound(
    sound_subtitles: List, x: float, y: float, z: float, yaw: float
) -> List[float]:
    sound_vector = [0] * (len(sound_list) * 4 + 1)
    for sound in sound_subtitles:
        if sound.x - x > 16 or sound.y - y > 16 or sound.z - z > 16:
            continue
        if sound.x - x < -16 or sound.y - y < -16 or sound.z - z < -16:
            continue
        for idx, translation_key in enumerate(sound_list):
            if translation_key == sound.translate_key:
                sound_vector[idx * 4] = 1
                sound_vector[idx * 4 + 1] = (sound.x - x) / 16
                sound_vector[idx * 4 + 2] = (sound.y - y) / 16
                sound_vector[idx * 4 + 3] = (sound.z - z) / 16

    sound_vector[-1] = yaw / 180.0
    return sound_vector


class FindAnimalWrapper(gym.Wrapper):
    def __init__(self):
        self.env = mydojo.make(
            initialInventoryCommands=[],
            initialPosition=None,  # nullable
            initialMobsCommands=[
                # "minecraft:sheep",
                # "minecraft:sheep ~ ~ ~4",
                # player looks at south (positive Z) when spawn
            ],
            imageSizeX=114,
            imageSizeY=64,
            visibleSizeX=114,
            visibleSizeY=64,
            seed=12345,  # nullable
            allowMobSpawn=False,
            alwaysDay=True,
            alwaysNight=False,
            initialWeather="clear",  # nullable
            isHardCore=False,
            isWorldFlat=True,  # superflat world
            obs_keys=["sound_subtitles"],
            initialExtraCommands=[
                "tp @p 0 -59 0",  # tp player
                "fill ~-5 ~-1 ~-5 ~5 ~2 ~5 minecraft:glass hollow",  # make a cage
                "fill ~-4 ~-1 ~-4 ~-1 ~-1 ~-1 minecraft:acacia_fence outline",  # make a cage
                "fill ~1 ~-1 ~1 ~4 ~-1 ~4 minecraft:acacia_fence outline",  # make a cage
                "fill ~-4 ~-1 ~1 ~-1 ~-1 ~4 minecraft:acacia_fence outline",  # make a cage
                "fill ~1 ~-1 ~-4 ~4 ~-1 ~-1 minecraft:acacia_fence outline",  # make a cage
                "fill ~-3 ~-1 ~-3 ~-2 ~-1 ~-2 minecraft:air outline",  # make a cage
                "fill ~2 ~-1 ~2 ~3 ~-1 ~3 minecraft:air outline",  # make a cage
                "fill ~-3 ~-1 ~2 ~-2 ~-1 ~3 minecraft:air outline",  # make a cage
                "fill ~2 ~-1 ~-3 ~3 ~-1 ~-2 minecraft:air outline",  # make a cage
                "fill ~-5 ~2 ~-5 ~5 ~10 ~5 minecraft:air replace",  # make a cage
                "summon minecraft:sheep ~3 ~ ~3",
                "summon minecraft:sheep ~3 ~ ~3",
                "summon minecraft:sheep 3 ~ ~3",
                "summon minecraft:pig ~-3 ~ ~3",
                "summon minecraft:pig ~-3 ~ ~3",
                "summon minecraft:pig -3 ~ ~3",
            ],
        )
        super(FindAnimalWrapper, self).__init__(self.env)
        self.action_space = gym.spaces.Discrete(6)
        self.observation_space = gym.spaces.Box(
            low=-1, high=1, shape=(29,), dtype=np.float32
        )

    def step(
        self, action: WrapperActType
    ) -> tuple[WrapperObsType, SupportsFloat, bool, bool, dict[str, Any]]:
        action_arr = int_to_action(action)
        obs, reward, terminated, truncated, info = self.env.step(action_arr)
        # rgb = obs["rgb"]
        obs = obs["obs"]
        is_dead = obs.is_dead
        sound_subtitles = obs.sound_subtitles
        sound_vector = encode_sound(sound_subtitles, obs.x, obs.y, obs.z, obs.yaw)

        reward = 1  # initial reward
        if is_dead:  #
            if self.initial_env.isHardCore:
                reward = -10000000
                terminated = True
            else:  # send respawn packet
                # pass
                reward = -200
                terminated = True
                # send_respawn(self.json_socket)
                # print("Dead!!!!!")
                # res = self.json_socket.receive_json()  # throw away
        return (
            np.array(sound_vector, dtype=np.float32),
            reward,
            terminated,
            truncated,
            info,
        )  # , done: deprecated

    def reset(self, fast_reset: bool = True) -> WrapperObsType:
        obs = self.env.reset(fast_reset=fast_reset)
        obs = obs["obs"]
        sound_subtitles = obs.sound_subtitles
        sound_vector = encode_sound(sound_subtitles, obs.x, obs.y, obs.z, obs.yaw)
        return np.array(sound_vector, dtype=np.float32)


def main():
    env = FindAnimalWrapper()
    buffer_size = 1000000
    batch_size = 256
    gamma = 0.99
    learning_rate = 0.0005
    update_freq = 25
    hidden_dim = 128  # 128정도 해보기
    state_dim = env.observation_space.shape
    action_dim = env.action_space.n
    agent = DQNSoundAgent(
        state_dim,
        action_dim,
        hidden_dim,
        buffer_size,
        batch_size,
        gamma,
        learning_rate,
        # weight_decay=weight_decay,
    )
    from wrapper_runners.dqn_wrapper_runner import DQNWrapperRunner

    runner = DQNWrapperRunner(
        env,
        env_name="FindAnimal",
        agent=agent,
        max_steps_per_episode=400,
        num_episodes=700,
        test_frequency=10,
        solved_criterion=lambda avg_score, test_score, episode: False
        if avg_score is not None
        else False and episode >= 300,
        after_wandb_init=lambda *args: None,
        warmup_episodes=0,
        update_frequency=update_freq,
        epsilon_init=1.0,
        epsilon_min=0.01,
        epsilon_decay=0.99,
        resume=False,
        max_saved_models=2,
    )
    runner.run_wrapper(record_video=True)


if __name__ == "__main__":
    main()
