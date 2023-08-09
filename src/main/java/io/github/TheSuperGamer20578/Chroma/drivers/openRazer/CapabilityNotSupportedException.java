package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

public class CapabilityNotSupportedException extends Exception {
    CapabilityNotSupportedException(Capability capability) {
        super("Capability " + capability + " is not supported by this device.");
    }
}
