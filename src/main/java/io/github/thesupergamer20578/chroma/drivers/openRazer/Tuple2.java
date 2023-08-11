package io.github.thesupergamer20578.chroma.drivers.openRazer;

import org.freedesktop.dbus.Tuple;
import org.freedesktop.dbus.annotations.Position;

class Tuple2<T0, T1> extends Tuple {
    @Position(0) public T0 i0;
    @Position(1) public T1 i1;

    Tuple2(T0 i0, T1 i1) {
        this.i0 = i0;
        this.i1 = i1;
    }
}
