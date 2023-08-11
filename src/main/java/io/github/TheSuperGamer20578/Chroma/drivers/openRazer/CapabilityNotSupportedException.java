package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

/**
 * Thrown to indicate that a capability is not supported by the device.
 */
public class CapabilityNotSupportedException extends Exception {
    CapabilityNotSupportedException(Capability capability) {
        super("Capability " + capability + " is not supported by this device.");
    }
}
