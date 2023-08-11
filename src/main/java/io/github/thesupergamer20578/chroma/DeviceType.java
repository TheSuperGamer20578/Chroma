package io.github.thesupergamer20578.chroma;

/**
 * The type of device.
 */
public enum DeviceType {
    /**
     * A keyboard.
     */
    KEYBOARD,

    /**
     * A mouse.
     */
    MOUSE,

    /**
     * A headset.
     */
    HEADSET,

    /**
     * A mousepad.
     */
    MOUSEPAD,

    /**
     * A keypad.
     */
    KEYPAD,

    /**
     * A chromalink device.
     */
    CHROMA_LINK,

    /**
     * An unknown device.
     * This is used when the device type is unknown.
     * The use of this is indicative of a bug.
     */
    UNKNOWN,
}
