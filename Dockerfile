# Select ubuntu base image
FROM ubuntu:22.04

# Install Java, Python, Git, OpenGL
RUN apt-get update && \
    apt-get install -y openjdk-21-jdk python3-pip git libgl1-mesa-dev libegl1-mesa-dev libglew-dev&& \
    apt-get clean

# If you want to use PNG mode, you need to install libpng and zlib also
# RUN apt-get install -y libpng-dev zlib1g-dev

RUN python3 --version
RUN pip3 install --upgrade pip
RUN pip3 install cmake

RUN pip3 install git+https://github.com/yhs0602/CraftGround.git@dev  

# Clone test repository
WORKDIR /workspace
RUN echo "Cloning repository"
RUN git clone https://github.com/yhs0602/minecraft-simulator-benchmark.git

# Set work directory and default execution
WORKDIR /workspace/minecraft-simulator-benchmark
RUN pip3 install wandb tensorboard moviepy git+https://github.com/DLR-RM/stable-baselines3.git
RUN WANDB_MODE=offline PYTHONPATH=. python3 experiments/craftground_exp.py --mode raw --image_width 64x64 --load simulation --max-steps 100
ENTRYPOINT ["bash"]