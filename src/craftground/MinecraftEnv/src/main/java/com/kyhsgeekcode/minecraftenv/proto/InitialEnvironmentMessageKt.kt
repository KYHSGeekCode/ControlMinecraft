// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: proto/initial_environment.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.kyhsgeekcode.minecraftenv.proto;

@kotlin.jvm.JvmName("-initializeinitialEnvironmentMessage")
public inline fun initialEnvironmentMessage(block: com.kyhsgeekcode.minecraftenv.proto.InitialEnvironmentMessageKt.Dsl.() -> kotlin.Unit): com.kyhsgeekcode.minecraftenv.proto.InitialEnvironment.InitialEnvironmentMessage =
  com.kyhsgeekcode.minecraftenv.proto.InitialEnvironmentMessageKt.Dsl._create(com.kyhsgeekcode.minecraftenv.proto.InitialEnvironment.InitialEnvironmentMessage.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `InitialEnvironmentMessage`
 */
public object InitialEnvironmentMessageKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.kyhsgeekcode.minecraftenv.proto.InitialEnvironment.InitialEnvironmentMessage.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
      internal fun _create(builder: com.kyhsgeekcode.minecraftenv.proto.InitialEnvironment.InitialEnvironmentMessage.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
  @kotlin.PublishedApi
    internal fun _build(): com.kyhsgeekcode.minecraftenv.proto.InitialEnvironment.InitialEnvironmentMessage = _builder.build()

    /**
     * ```
     * Required. The width of the image.
     * ```
     *
     * `int32 imageSizeX = 1;`
     */
    public var imageSizeX: kotlin.Int
      @JvmName("getImageSizeX")
      get() = _builder.imageSizeX
      @JvmName("setImageSizeX")
      set(value) {
        _builder.imageSizeX = value
      }
    /**
     * ```
     * Required. The width of the image.
     * ```
     *
     * `int32 imageSizeX = 1;`
     */
    public fun clearImageSizeX() {
      _builder.clearImageSizeX()
    }

    /**
     * ```
     * Required. The height of the image.
     * ```
     *
     * `int32 imageSizeY = 2;`
     */
    public var imageSizeY: kotlin.Int
      @JvmName("getImageSizeY")
      get() = _builder.imageSizeY
      @JvmName("setImageSizeY")
      set(value) {
        _builder.imageSizeY = value
      }
    /**
     * ```
     * Required. The height of the image.
     * ```
     *
     * `int32 imageSizeY = 2;`
     */
    public fun clearImageSizeY() {
      _builder.clearImageSizeY()
    }

    /**
     * ```
     * Default = SURVIVAL
     * ```
     *
     * `.GameMode gamemode = 3;`
     */
    public var gamemode: com.kyhsgeekcode.minecraftenv.proto.InitialEnvironment.GameMode
      @JvmName("getGamemode")
      get() = _builder.gamemode
      @JvmName("setGamemode")
      set(value) {
        _builder.gamemode = value
      }
    public var gamemodeValue: kotlin.Int
      @JvmName("getGamemodeValue")
      get() = _builder.gamemodeValue
      @JvmName("setGamemodeValue")
      set(value) {
        _builder.gamemodeValue = value
      }
    /**
     * ```
     * Default = SURVIVAL
     * ```
     *
     * `.GameMode gamemode = 3;`
     */
    public fun clearGamemode() {
      _builder.clearGamemode()
    }

    /**
     * ```
     * Default = NORMAL
     * ```
     *
     * `.Difficulty difficulty = 4;`
     */
    public var difficulty: com.kyhsgeekcode.minecraftenv.proto.InitialEnvironment.Difficulty
      @JvmName("getDifficulty")
      get() = _builder.difficulty
      @JvmName("setDifficulty")
      set(value) {
        _builder.difficulty = value
      }
    public var difficultyValue: kotlin.Int
      @JvmName("getDifficultyValue")
      get() = _builder.difficultyValue
      @JvmName("setDifficultyValue")
      set(value) {
        _builder.difficultyValue = value
      }
    /**
     * ```
     * Default = NORMAL
     * ```
     *
     * `.Difficulty difficulty = 4;`
     */
    public fun clearDifficulty() {
      _builder.clearDifficulty()
    }

    /**
     * ```
     * Default = DEFAULT
     * ```
     *
     * `.WorldType worldType = 5;`
     */
    public var worldType: com.kyhsgeekcode.minecraftenv.proto.InitialEnvironment.WorldType
      @JvmName("getWorldType")
      get() = _builder.worldType
      @JvmName("setWorldType")
      set(value) {
        _builder.worldType = value
      }
    public var worldTypeValue: kotlin.Int
      @JvmName("getWorldTypeValue")
      get() = _builder.worldTypeValue
      @JvmName("setWorldTypeValue")
      set(value) {
        _builder.worldTypeValue = value
      }
    /**
     * ```
     * Default = DEFAULT
     * ```
     *
     * `.WorldType worldType = 5;`
     */
    public fun clearWorldType() {
      _builder.clearWorldType()
    }

    /**
     * ```
     * Empty for no value
     * ```
     *
     * `string worldTypeArgs = 6;`
     */
    public var worldTypeArgs: kotlin.String
      @JvmName("getWorldTypeArgs")
      get() = _builder.worldTypeArgs
      @JvmName("setWorldTypeArgs")
      set(value) {
        _builder.worldTypeArgs = value
      }
    /**
     * ```
     * Empty for no value
     * ```
     *
     * `string worldTypeArgs = 6;`
     */
    public fun clearWorldTypeArgs() {
      _builder.clearWorldTypeArgs()
    }

    /**
     * ```
     * Empty for no value
     * ```
     *
     * `string seed = 7;`
     */
    public var seed: kotlin.String
      @JvmName("getSeed")
      get() = _builder.seed
      @JvmName("setSeed")
      set(value) {
        _builder.seed = value
      }
    /**
     * ```
     * Empty for no value
     * ```
     *
     * `string seed = 7;`
     */
    public fun clearSeed() {
      _builder.clearSeed()
    }

    /**
     * ```
     * Default = true
     * ```
     *
     * `bool generate_structures = 8;`
     */
    public var generateStructures: kotlin.Boolean
      @JvmName("getGenerateStructures")
      get() = _builder.generateStructures
      @JvmName("setGenerateStructures")
      set(value) {
        _builder.generateStructures = value
      }
    /**
     * ```
     * Default = true
     * ```
     *
     * `bool generate_structures = 8;`
     */
    public fun clearGenerateStructures() {
      _builder.clearGenerateStructures()
    }

    /**
     * ```
     * Default = false
     * ```
     *
     * `bool bonus_chest = 9;`
     */
    public var bonusChest: kotlin.Boolean
      @JvmName("getBonusChest")
      get() = _builder.bonusChest
      @JvmName("setBonusChest")
      set(value) {
        _builder.bonusChest = value
      }
    /**
     * ```
     * Default = false
     * ```
     *
     * `bool bonus_chest = 9;`
     */
    public fun clearBonusChest() {
      _builder.clearBonusChest()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class DatapackPathsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated string datapackPaths = 10;`
     * @return A list containing the datapackPaths.
     */
    public val datapackPaths: com.google.protobuf.kotlin.DslList<kotlin.String, DatapackPathsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.datapackPathsList
      )
    /**
     * `repeated string datapackPaths = 10;`
     * @param value The datapackPaths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addDatapackPaths")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, DatapackPathsProxy>.add(value: kotlin.String) {
      _builder.addDatapackPaths(value)
    }
    /**
     * `repeated string datapackPaths = 10;`
     * @param value The datapackPaths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignDatapackPaths")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, DatapackPathsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * `repeated string datapackPaths = 10;`
     * @param values The datapackPaths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllDatapackPaths")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, DatapackPathsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllDatapackPaths(values)
    }
    /**
     * `repeated string datapackPaths = 10;`
     * @param values The datapackPaths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllDatapackPaths")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, DatapackPathsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * `repeated string datapackPaths = 10;`
     * @param index The index to set the value at.
     * @param value The datapackPaths to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setDatapackPaths")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, DatapackPathsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setDatapackPaths(index, value)
    }/**
     * `repeated string datapackPaths = 10;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearDatapackPaths")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, DatapackPathsProxy>.clear() {
      _builder.clearDatapackPaths()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class InitialExtraCommandsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated string initialExtraCommands = 11;`
     * @return A list containing the initialExtraCommands.
     */
    public val initialExtraCommands: com.google.protobuf.kotlin.DslList<kotlin.String, InitialExtraCommandsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.initialExtraCommandsList
      )
    /**
     * `repeated string initialExtraCommands = 11;`
     * @param value The initialExtraCommands to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addInitialExtraCommands")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, InitialExtraCommandsProxy>.add(value: kotlin.String) {
      _builder.addInitialExtraCommands(value)
    }
    /**
     * `repeated string initialExtraCommands = 11;`
     * @param value The initialExtraCommands to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignInitialExtraCommands")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, InitialExtraCommandsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * `repeated string initialExtraCommands = 11;`
     * @param values The initialExtraCommands to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllInitialExtraCommands")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, InitialExtraCommandsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllInitialExtraCommands(values)
    }
    /**
     * `repeated string initialExtraCommands = 11;`
     * @param values The initialExtraCommands to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllInitialExtraCommands")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, InitialExtraCommandsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * `repeated string initialExtraCommands = 11;`
     * @param index The index to set the value at.
     * @param value The initialExtraCommands to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setInitialExtraCommands")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, InitialExtraCommandsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setInitialExtraCommands(index, value)
    }/**
     * `repeated string initialExtraCommands = 11;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearInitialExtraCommands")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, InitialExtraCommandsProxy>.clear() {
      _builder.clearInitialExtraCommands()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class KilledStatKeysProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated string killedStatKeys = 12;`
     * @return A list containing the killedStatKeys.
     */
    public val killedStatKeys: com.google.protobuf.kotlin.DslList<kotlin.String, KilledStatKeysProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.killedStatKeysList
      )
    /**
     * `repeated string killedStatKeys = 12;`
     * @param value The killedStatKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addKilledStatKeys")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, KilledStatKeysProxy>.add(value: kotlin.String) {
      _builder.addKilledStatKeys(value)
    }
    /**
     * `repeated string killedStatKeys = 12;`
     * @param value The killedStatKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignKilledStatKeys")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, KilledStatKeysProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * `repeated string killedStatKeys = 12;`
     * @param values The killedStatKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllKilledStatKeys")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, KilledStatKeysProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllKilledStatKeys(values)
    }
    /**
     * `repeated string killedStatKeys = 12;`
     * @param values The killedStatKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllKilledStatKeys")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, KilledStatKeysProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * `repeated string killedStatKeys = 12;`
     * @param index The index to set the value at.
     * @param value The killedStatKeys to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setKilledStatKeys")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, KilledStatKeysProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setKilledStatKeys(index, value)
    }/**
     * `repeated string killedStatKeys = 12;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearKilledStatKeys")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, KilledStatKeysProxy>.clear() {
      _builder.clearKilledStatKeys()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class MinedStatKeysProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated string minedStatKeys = 13;`
     * @return A list containing the minedStatKeys.
     */
    public val minedStatKeys: com.google.protobuf.kotlin.DslList<kotlin.String, MinedStatKeysProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.minedStatKeysList
      )
    /**
     * `repeated string minedStatKeys = 13;`
     * @param value The minedStatKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addMinedStatKeys")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, MinedStatKeysProxy>.add(value: kotlin.String) {
      _builder.addMinedStatKeys(value)
    }
    /**
     * `repeated string minedStatKeys = 13;`
     * @param value The minedStatKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignMinedStatKeys")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, MinedStatKeysProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * `repeated string minedStatKeys = 13;`
     * @param values The minedStatKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllMinedStatKeys")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, MinedStatKeysProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllMinedStatKeys(values)
    }
    /**
     * `repeated string minedStatKeys = 13;`
     * @param values The minedStatKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllMinedStatKeys")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, MinedStatKeysProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * `repeated string minedStatKeys = 13;`
     * @param index The index to set the value at.
     * @param value The minedStatKeys to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setMinedStatKeys")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, MinedStatKeysProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setMinedStatKeys(index, value)
    }/**
     * `repeated string minedStatKeys = 13;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearMinedStatKeys")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, MinedStatKeysProxy>.clear() {
      _builder.clearMinedStatKeys()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class MiscStatKeysProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated string miscStatKeys = 14;`
     * @return A list containing the miscStatKeys.
     */
    public val miscStatKeys: com.google.protobuf.kotlin.DslList<kotlin.String, MiscStatKeysProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.miscStatKeysList
      )
    /**
     * `repeated string miscStatKeys = 14;`
     * @param value The miscStatKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addMiscStatKeys")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, MiscStatKeysProxy>.add(value: kotlin.String) {
      _builder.addMiscStatKeys(value)
    }
    /**
     * `repeated string miscStatKeys = 14;`
     * @param value The miscStatKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignMiscStatKeys")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, MiscStatKeysProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * `repeated string miscStatKeys = 14;`
     * @param values The miscStatKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllMiscStatKeys")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, MiscStatKeysProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllMiscStatKeys(values)
    }
    /**
     * `repeated string miscStatKeys = 14;`
     * @param values The miscStatKeys to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllMiscStatKeys")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, MiscStatKeysProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * `repeated string miscStatKeys = 14;`
     * @param index The index to set the value at.
     * @param value The miscStatKeys to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setMiscStatKeys")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, MiscStatKeysProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setMiscStatKeys(index, value)
    }/**
     * `repeated string miscStatKeys = 14;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearMiscStatKeys")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, MiscStatKeysProxy>.clear() {
      _builder.clearMiscStatKeys()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class SurroundingEntityDistancesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated int32 surroundingEntityDistances = 15;`
     */
     public val surroundingEntityDistances: com.google.protobuf.kotlin.DslList<kotlin.Int, SurroundingEntityDistancesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.surroundingEntityDistancesList
      )
    /**
     * `repeated int32 surroundingEntityDistances = 15;`
     * @param value The surroundingEntityDistances to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addSurroundingEntityDistances")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Int, SurroundingEntityDistancesProxy>.add(value: kotlin.Int) {
      _builder.addSurroundingEntityDistances(value)
    }/**
     * `repeated int32 surroundingEntityDistances = 15;`
     * @param value The surroundingEntityDistances to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignSurroundingEntityDistances")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Int, SurroundingEntityDistancesProxy>.plusAssign(value: kotlin.Int) {
      add(value)
    }/**
     * `repeated int32 surroundingEntityDistances = 15;`
     * @param values The surroundingEntityDistances to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllSurroundingEntityDistances")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Int, SurroundingEntityDistancesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.Int>) {
      _builder.addAllSurroundingEntityDistances(values)
    }/**
     * `repeated int32 surroundingEntityDistances = 15;`
     * @param values The surroundingEntityDistances to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllSurroundingEntityDistances")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.Int, SurroundingEntityDistancesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.Int>) {
      addAll(values)
    }/**
     * `repeated int32 surroundingEntityDistances = 15;`
     * @param index The index to set the value at.
     * @param value The surroundingEntityDistances to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setSurroundingEntityDistances")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.Int, SurroundingEntityDistancesProxy>.set(index: kotlin.Int, value: kotlin.Int) {
      _builder.setSurroundingEntityDistances(index, value)
    }/**
     * `repeated int32 surroundingEntityDistances = 15;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearSurroundingEntityDistances")
    public fun com.google.protobuf.kotlin.DslList<kotlin.Int, SurroundingEntityDistancesProxy>.clear() {
      _builder.clearSurroundingEntityDistances()
    }
    /**
     * `bool hudHidden = 16;`
     */
    public var hudHidden: kotlin.Boolean
      @JvmName("getHudHidden")
      get() = _builder.hudHidden
      @JvmName("setHudHidden")
      set(value) {
        _builder.hudHidden = value
      }
    /**
     * `bool hudHidden = 16;`
     */
    public fun clearHudHidden() {
      _builder.clearHudHidden()
    }

    /**
     * `int32 render_distance = 17;`
     */
    public var renderDistance: kotlin.Int
      @JvmName("getRenderDistance")
      get() = _builder.renderDistance
      @JvmName("setRenderDistance")
      set(value) {
        _builder.renderDistance = value
      }
    /**
     * `int32 render_distance = 17;`
     */
    public fun clearRenderDistance() {
      _builder.clearRenderDistance()
    }

    /**
     * `int32 simulation_distance = 18;`
     */
    public var simulationDistance: kotlin.Int
      @JvmName("getSimulationDistance")
      get() = _builder.simulationDistance
      @JvmName("setSimulationDistance")
      set(value) {
        _builder.simulationDistance = value
      }
    /**
     * `int32 simulation_distance = 18;`
     */
    public fun clearSimulationDistance() {
      _builder.clearSimulationDistance()
    }

    /**
     * ```
     * If > 0, binocular mode
     * ```
     *
     * `float eye_distance = 19;`
     */
    public var eyeDistance: kotlin.Float
      @JvmName("getEyeDistance")
      get() = _builder.eyeDistance
      @JvmName("setEyeDistance")
      set(value) {
        _builder.eyeDistance = value
      }
    /**
     * ```
     * If > 0, binocular mode
     * ```
     *
     * `float eye_distance = 19;`
     */
    public fun clearEyeDistance() {
      _builder.clearEyeDistance()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class StructurePathsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated string structurePaths = 20;`
     * @return A list containing the structurePaths.
     */
    public val structurePaths: com.google.protobuf.kotlin.DslList<kotlin.String, StructurePathsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.structurePathsList
      )
    /**
     * `repeated string structurePaths = 20;`
     * @param value The structurePaths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addStructurePaths")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, StructurePathsProxy>.add(value: kotlin.String) {
      _builder.addStructurePaths(value)
    }
    /**
     * `repeated string structurePaths = 20;`
     * @param value The structurePaths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignStructurePaths")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, StructurePathsProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * `repeated string structurePaths = 20;`
     * @param values The structurePaths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllStructurePaths")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, StructurePathsProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllStructurePaths(values)
    }
    /**
     * `repeated string structurePaths = 20;`
     * @param values The structurePaths to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllStructurePaths")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, StructurePathsProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * `repeated string structurePaths = 20;`
     * @param index The index to set the value at.
     * @param value The structurePaths to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setStructurePaths")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, StructurePathsProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setStructurePaths(index, value)
    }/**
     * `repeated string structurePaths = 20;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearStructurePaths")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, StructurePathsProxy>.clear() {
      _builder.clearStructurePaths()
    }
    /**
     * `bool no_fov_effect = 21;`
     */
    public var noFovEffect: kotlin.Boolean
      @JvmName("getNoFovEffect")
      get() = _builder.noFovEffect
      @JvmName("setNoFovEffect")
      set(value) {
        _builder.noFovEffect = value
      }
    /**
     * `bool no_fov_effect = 21;`
     */
    public fun clearNoFovEffect() {
      _builder.clearNoFovEffect()
    }

    /**
     * `bool request_raycast = 22;`
     */
    public var requestRaycast: kotlin.Boolean
      @JvmName("getRequestRaycast")
      get() = _builder.requestRaycast
      @JvmName("setRequestRaycast")
      set(value) {
        _builder.requestRaycast = value
      }
    /**
     * `bool request_raycast = 22;`
     */
    public fun clearRequestRaycast() {
      _builder.clearRequestRaycast()
    }

    /**
     * `int32 screen_encoding_mode = 23;`
     */
    public var screenEncodingMode: kotlin.Int
      @JvmName("getScreenEncodingMode")
      get() = _builder.screenEncodingMode
      @JvmName("setScreenEncodingMode")
      set(value) {
        _builder.screenEncodingMode = value
      }
    /**
     * `int32 screen_encoding_mode = 23;`
     */
    public fun clearScreenEncodingMode() {
      _builder.clearScreenEncodingMode()
    }

    /**
     * `bool requiresSurroundingBlocks = 24;`
     */
    public var requiresSurroundingBlocks: kotlin.Boolean
      @JvmName("getRequiresSurroundingBlocks")
      get() = _builder.requiresSurroundingBlocks
      @JvmName("setRequiresSurroundingBlocks")
      set(value) {
        _builder.requiresSurroundingBlocks = value
      }
    /**
     * `bool requiresSurroundingBlocks = 24;`
     */
    public fun clearRequiresSurroundingBlocks() {
      _builder.clearRequiresSurroundingBlocks()
    }

    /**
     * `string level_display_name_to_play = 25;`
     */
    public var levelDisplayNameToPlay: kotlin.String
      @JvmName("getLevelDisplayNameToPlay")
      get() = _builder.levelDisplayNameToPlay
      @JvmName("setLevelDisplayNameToPlay")
      set(value) {
        _builder.levelDisplayNameToPlay = value
      }
    /**
     * `string level_display_name_to_play = 25;`
     */
    public fun clearLevelDisplayNameToPlay() {
      _builder.clearLevelDisplayNameToPlay()
    }

    /**
     * ```
     * Default = 70
     * ```
     *
     * `float fov = 26;`
     */
    public var fov: kotlin.Float
      @JvmName("getFov")
      get() = _builder.fov
      @JvmName("setFov")
      set(value) {
        _builder.fov = value
      }
    /**
     * ```
     * Default = 70
     * ```
     *
     * `float fov = 26;`
     */
    public fun clearFov() {
      _builder.clearFov()
    }

    /**
     * `bool requiresBiomeInfo = 27;`
     */
    public var requiresBiomeInfo: kotlin.Boolean
      @JvmName("getRequiresBiomeInfo")
      get() = _builder.requiresBiomeInfo
      @JvmName("setRequiresBiomeInfo")
      set(value) {
        _builder.requiresBiomeInfo = value
      }
    /**
     * `bool requiresBiomeInfo = 27;`
     */
    public fun clearRequiresBiomeInfo() {
      _builder.clearRequiresBiomeInfo()
    }

    /**
     * `bool requiresHeightmap = 28;`
     */
    public var requiresHeightmap: kotlin.Boolean
      @JvmName("getRequiresHeightmap")
      get() = _builder.requiresHeightmap
      @JvmName("setRequiresHeightmap")
      set(value) {
        _builder.requiresHeightmap = value
      }
    /**
     * `bool requiresHeightmap = 28;`
     */
    public fun clearRequiresHeightmap() {
      _builder.clearRequiresHeightmap()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.kyhsgeekcode.minecraftenv.proto.InitialEnvironment.InitialEnvironmentMessage.copy(block: `com.kyhsgeekcode.minecraftenv.proto`.InitialEnvironmentMessageKt.Dsl.() -> kotlin.Unit): com.kyhsgeekcode.minecraftenv.proto.InitialEnvironment.InitialEnvironmentMessage =
  `com.kyhsgeekcode.minecraftenv.proto`.InitialEnvironmentMessageKt.Dsl._create(this.toBuilder()).apply { block() }._build()

