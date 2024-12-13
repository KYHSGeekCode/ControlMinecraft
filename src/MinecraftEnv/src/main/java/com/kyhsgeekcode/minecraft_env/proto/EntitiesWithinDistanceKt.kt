// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: observation_space.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package com.kyhsgeekcode.minecraft_env.proto;

@kotlin.jvm.JvmName("-initializeentitiesWithinDistance")
public inline fun entitiesWithinDistance(block: com.kyhsgeekcode.minecraft_env.proto.EntitiesWithinDistanceKt.Dsl.() -> kotlin.Unit): com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntitiesWithinDistance =
  com.kyhsgeekcode.minecraft_env.proto.EntitiesWithinDistanceKt.Dsl._create(com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntitiesWithinDistance.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `EntitiesWithinDistance`
 */
public object EntitiesWithinDistanceKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntitiesWithinDistance.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntitiesWithinDistance.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntitiesWithinDistance = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class EntitiesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .EntityInfo entities = 1;`
     */
     public val entities: com.google.protobuf.kotlin.DslList<com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntityInfo, EntitiesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getEntitiesList()
      )
    /**
     * `repeated .EntityInfo entities = 1;`
     * @param value The entities to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addEntities")
    public fun com.google.protobuf.kotlin.DslList<com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntityInfo, EntitiesProxy>.add(value: com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntityInfo) {
      _builder.addEntities(value)
    }
    /**
     * `repeated .EntityInfo entities = 1;`
     * @param value The entities to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignEntities")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntityInfo, EntitiesProxy>.plusAssign(value: com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntityInfo) {
      add(value)
    }
    /**
     * `repeated .EntityInfo entities = 1;`
     * @param values The entities to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllEntities")
    public fun com.google.protobuf.kotlin.DslList<com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntityInfo, EntitiesProxy>.addAll(values: kotlin.collections.Iterable<com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntityInfo>) {
      _builder.addAllEntities(values)
    }
    /**
     * `repeated .EntityInfo entities = 1;`
     * @param values The entities to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllEntities")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntityInfo, EntitiesProxy>.plusAssign(values: kotlin.collections.Iterable<com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntityInfo>) {
      addAll(values)
    }
    /**
     * `repeated .EntityInfo entities = 1;`
     * @param index The index to set the value at.
     * @param value The entities to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setEntities")
    public operator fun com.google.protobuf.kotlin.DslList<com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntityInfo, EntitiesProxy>.set(index: kotlin.Int, value: com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntityInfo) {
      _builder.setEntities(index, value)
    }
    /**
     * `repeated .EntityInfo entities = 1;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearEntities")
    public fun com.google.protobuf.kotlin.DslList<com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntityInfo, EntitiesProxy>.clear() {
      _builder.clearEntities()
    }

  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntitiesWithinDistance.copy(block: `com.kyhsgeekcode.minecraft_env.proto`.EntitiesWithinDistanceKt.Dsl.() -> kotlin.Unit): com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.EntitiesWithinDistance =
  `com.kyhsgeekcode.minecraft_env.proto`.EntitiesWithinDistanceKt.Dsl._create(this.toBuilder()).apply { block() }._build()

