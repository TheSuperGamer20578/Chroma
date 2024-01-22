package io.github.thesupergamer20578.chroma.drivers.razerSynapse;

import com.sun.jna.Structure;

abstract class Effect<T extends Enum<?>> extends Structure {
    abstract T getEffectType();
}
