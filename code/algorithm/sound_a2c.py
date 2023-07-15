import numpy as np
import torch

from algorithm.a2c import A2CAlgorithm
from logger import Logger
from models.sound_a2c import SoundActor, SoundCritic


class SoundA2CAlgorithm(A2CAlgorithm):
    def __init__(
        self,
        env,
        logger: Logger,
        num_episodes: int,
        steps_per_episode: int,
        test_frequency,
        solved_criterion,
        hidden_dim,
        device,
        update_frequency,
        train_frequency,
        gamma,
        learning_rate,
        weight_decay,
        **kwargs,
    ):
        super().__init__(
            env,
            logger,
            num_episodes,
            steps_per_episode,
            test_frequency,
            solved_criterion,
            hidden_dim,
            device,
            update_frequency,
            train_frequency,
            gamma,
        )
        self.state_dim = (np.prod(env.observation_space.shape),)
        self.actor = SoundActor(self.state_dim, self.action_dim, hidden_dim).to(device)
        self.critic = SoundCritic(self.state_dim, hidden_dim).to(device)
        self.actor_optim = torch.optim.Adam(
            self.actor.parameters(), lr=learning_rate, weight_decay=weight_decay
        )
        self.critic_optim = torch.optim.Adam(
            self.critic.parameters(), lr=learning_rate, weight_decay=weight_decay
        )
