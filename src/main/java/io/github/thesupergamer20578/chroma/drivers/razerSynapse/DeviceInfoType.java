package io.github.thesupergamer20578.chroma.drivers.razerSynapse;

import com.sun.jna.Structure;

public class DeviceInfoType extends Structure {
    public CEnum.Native<DeviceTypeEnum> DeviceType;
    public int Connected;

    DeviceInfoType() {}

    @CEnum.StartAt(1)
    public enum DeviceTypeEnum implements CEnum<DeviceTypeEnum> {
        KEYBOARD,
        MOUSE,
        HEADSET,
        MOUSEPAD,
        KEYPAD,
        SYSTEM,
        SPEAKERS,
        INVALID,
    }
}
