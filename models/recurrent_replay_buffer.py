import random
from collections import deque
from typing import TypeAlias, List

import numpy as np

from models.dqn import Transition

Episode: TypeAlias = List[Transition]


class RecurrentReplayBuffer:
    def __init__(self, capacity):
        self.capacity = capacity
        self.memory = deque(maxlen=capacity)

    def add_episode(self, episode: Episode):
        self.memory.append(episode)

    def get_batch(
        self, batch_size, time_step
    ) -> List[Episode]:  # Actually, partial episode
        sampled_episodes = random.sample(self.memory, batch_size)
        batch = []
        for episode in sampled_episodes:
            point = np.random.randint(0, len(episode) + 1 - time_step)
            batch.append(episode[point : point + time_step])
        return batch

    def __len__(self):
        return len(self.memory)
