package io.github.TheSuperGamer20578.Chroma.drivers;

import io.github.TheSuperGamer20578.Chroma.Colour;
import io.github.TheSuperGamer20578.Chroma.WaveDirection;
import org.freedesktop.dbus.exceptions.DBusException;

public interface Driver {
    void shutdown();
    void clearKeyboardEffect();
    void staticKeyboardEffect(Colour colour);
    void customKeyboardEffect(Colour[][] layout);
    void waveKeyboardEffect(WaveDirection direction);

    void clearMouseEffect();
    void staticMouseEffect(Colour colour);
    void customMouseEffect(Colour[][] layout);

    void clearHeadsetEffect();
    void staticHeadsetEffect(Colour colour);
    void customHeadsetEffect(Colour[][] layout);

    void clearMousepadEffect();
    void staticMousepadEffect(Colour colour);
    void customMousepadEffect(Colour[][] layout);

    void clearKeypadEffect();
    void staticKeypadEffect(Colour colour);
    void customKeypadEffect(Colour[][] layout);

    void clearChromaLinkEffect();
    void staticChromaLinkEffect(Colour colour);
    void customChromaLinkEffect(Colour[][] layout);
}
