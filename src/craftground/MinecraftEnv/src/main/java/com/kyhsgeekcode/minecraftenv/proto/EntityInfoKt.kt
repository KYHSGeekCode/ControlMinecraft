// Generated by the protocol buffer compiler. DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: observation_space.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")

package com.kyhsgeekcode.minecraftenv.proto

@kotlin.jvm.JvmName("-initializeentityInfo")
public inline fun entityInfo(
    block: com.kyhsgeekcode.minecraftenv.proto.EntityInfoKt.Dsl.() -> kotlin.Unit,
): com.kyhsgeekcode.minecraftenv.proto.ObservationSpace.EntityInfo =
    com.kyhsgeekcode.minecraftenv.proto.EntityInfoKt.Dsl
        ._create(
            com.kyhsgeekcode.minecraftenv.proto.ObservationSpace.EntityInfo
                .newBuilder(),
        ).apply {
            block()
        }._build()

/**
 * Protobuf type `EntityInfo`
 */
public object EntityInfoKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
        private val _builder: com.kyhsgeekcode.minecraftenv.proto.ObservationSpace.EntityInfo.Builder,
    ) {
        public companion object {
            @kotlin.jvm.JvmSynthetic
            @kotlin.PublishedApi
            internal fun _create(builder: com.kyhsgeekcode.minecraftenv.proto.ObservationSpace.EntityInfo.Builder): Dsl = Dsl(builder)
        }

        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _build(): com.kyhsgeekcode.minecraftenv.proto.ObservationSpace.EntityInfo = _builder.build()

        /**
         * `string unique_name = 1;`
         */
        public var uniqueName: kotlin.String
            @JvmName("getUniqueName")
            get() = _builder.uniqueName

            @JvmName("setUniqueName")
            set(value) {
                _builder.uniqueName = value
            }

        /**
         * `string unique_name = 1;`
         */
        public fun clearUniqueName() {
            _builder.clearUniqueName()
        }

        /**
         * `string translation_key = 2;`
         */
        public var translationKey: kotlin.String
            @JvmName("getTranslationKey")
            get() = _builder.translationKey

            @JvmName("setTranslationKey")
            set(value) {
                _builder.translationKey = value
            }

        /**
         * `string translation_key = 2;`
         */
        public fun clearTranslationKey() {
            _builder.clearTranslationKey()
        }

        /**
         * `double x = 3;`
         */
        public var x: kotlin.Double
            @JvmName("getX")
            get() = _builder.x

            @JvmName("setX")
            set(value) {
                _builder.x = value
            }

        /**
         * `double x = 3;`
         */
        public fun clearX() {
            _builder.clearX()
        }

        /**
         * `double y = 4;`
         */
        public var y: kotlin.Double
            @JvmName("getY")
            get() = _builder.y

            @JvmName("setY")
            set(value) {
                _builder.y = value
            }

        /**
         * `double y = 4;`
         */
        public fun clearY() {
            _builder.clearY()
        }

        /**
         * `double z = 5;`
         */
        public var z: kotlin.Double
            @JvmName("getZ")
            get() = _builder.z

            @JvmName("setZ")
            set(value) {
                _builder.z = value
            }

        /**
         * `double z = 5;`
         */
        public fun clearZ() {
            _builder.clearZ()
        }

        /**
         * `double yaw = 6;`
         */
        public var yaw: kotlin.Double
            @JvmName("getYaw")
            get() = _builder.yaw

            @JvmName("setYaw")
            set(value) {
                _builder.yaw = value
            }

        /**
         * `double yaw = 6;`
         */
        public fun clearYaw() {
            _builder.clearYaw()
        }

        /**
         * `double pitch = 7;`
         */
        public var pitch: kotlin.Double
            @JvmName("getPitch")
            get() = _builder.pitch

            @JvmName("setPitch")
            set(value) {
                _builder.pitch = value
            }

        /**
         * `double pitch = 7;`
         */
        public fun clearPitch() {
            _builder.clearPitch()
        }

        /**
         * `double health = 8;`
         */
        public var health: kotlin.Double
            @JvmName("getHealth")
            get() = _builder.health

            @JvmName("setHealth")
            set(value) {
                _builder.health = value
            }

        /**
         * `double health = 8;`
         */
        public fun clearHealth() {
            _builder.clearHealth()
        }
    }
}

@kotlin.jvm.JvmSynthetic
public inline fun com.kyhsgeekcode.minecraftenv.proto.ObservationSpace.EntityInfo.copy(
    block: `com.kyhsgeekcode.minecraftenv.proto`.EntityInfoKt.Dsl.() -> kotlin.Unit,
): com.kyhsgeekcode.minecraftenv.proto.ObservationSpace.EntityInfo =
    `com.kyhsgeekcode.minecraftenv.proto`.EntityInfoKt.Dsl
        ._create(this.toBuilder())
        .apply { block() }
        ._build()
