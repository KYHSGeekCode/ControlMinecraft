# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: initial_environment.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database

# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(
    b'\n\x19initial_environment.proto"B\n\nBlockState\x12\t\n\x01x\x18\x01 \x01(\x05\x12\t\n\x01y\x18\x02 \x01(\x05\x12\t\n\x01z\x18\x03 \x01(\x05\x12\x13\n\x0b\x62lock_state\x18\x04 \x01(\t"\xba\x04\n\x19InitialEnvironmentMessage\x12 \n\x18initialInventoryCommands\x18\x01 \x03(\t\x12\x17\n\x0finitialPosition\x18\x02 \x03(\x05\x12\x1b\n\x13initialMobsCommands\x18\x03 \x03(\t\x12\x12\n\nimageSizeX\x18\x04 \x01(\x05\x12\x12\n\nimageSizeY\x18\x05 \x01(\x05\x12\x0c\n\x04seed\x18\x06 \x01(\x03\x12\x15\n\rallowMobSpawn\x18\x07 \x01(\x08\x12\x13\n\x0b\x61lwaysNight\x18\x08 \x01(\x08\x12\x11\n\talwaysDay\x18\t \x01(\x08\x12\x16\n\x0einitialWeather\x18\n \x01(\t\x12\x13\n\x0bisWorldFlat\x18\x0b \x01(\x08\x12\x14\n\x0cvisibleSizeX\x18\x0c \x01(\x05\x12\x14\n\x0cvisibleSizeY\x18\r \x01(\x05\x12\x1c\n\x14initialExtraCommands\x18\x0e \x03(\t\x12\x16\n\x0ekilledStatKeys\x18\x0f \x03(\t\x12\x15\n\rminedStatKeys\x18\x10 \x03(\t\x12\x14\n\x0cmiscStatKeys\x18\x11 \x03(\t\x12\'\n\x12initialBlockStates\x18\x12 \x03(\x0b\x32\x0b.BlockState\x12"\n\x1asurroundingEntityDistances\x18\x13 \x03(\x05\x12\x11\n\thudHidden\x18\x14 \x01(\x08\x12\x17\n\x0frender_distance\x18\x15 \x01(\x05\x12\x1b\n\x13simulation_distance\x18\x16 \x01(\x05\x62\x06proto3'
)

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(
    DESCRIPTOR, "initial_environment_pb2", globals()
)
if _descriptor._USE_C_DESCRIPTORS == False:
    DESCRIPTOR._options = None
    _BLOCKSTATE._serialized_start = 29
    _BLOCKSTATE._serialized_end = 95
    _INITIALENVIRONMENTMESSAGE._serialized_start = 98
    _INITIALENVIRONMENTMESSAGE._serialized_end = 668
# @@protoc_insertion_point(module_scope)
