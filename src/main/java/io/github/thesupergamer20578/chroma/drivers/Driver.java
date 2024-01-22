package io.github.thesupergamer20578.chroma.drivers;

import io.github.thesupergamer20578.chroma.ApplicationInfo;
import io.github.thesupergamer20578.chroma.Colour;
import io.github.thesupergamer20578.chroma.WaveDirection;

/**
 * The driver interface.
 */
public interface Driver {
    /**
     * Initializes the driver.
     * This method should be called before any other methods.
     * Calling this method multiple times may cause unexpected behaviour.
     * @param applicationInfo The application info, shows up in the Connect tab in Razer Synapse on windows.
     */
    default void init(ApplicationInfo applicationInfo) {
        init();
    }

    void init();

    /**
     * Shuts down the driver and releases any resources it's using.
     * This method should be called when the driver is no longer needed.
     * The driver shouldn't be used after this method is called.
     */
    void shutdown();

    /**
     * Clears the effect on all keyboards.
     * This turns off all the LEDs on the keyboard.
     */
    void clearKeyboardEffect();

    /**
     * Sets a static effect on all keyboards.
     * @param colour The colour to set the effect to.
     */
    void staticKeyboardEffect(Colour colour);

    /**
     * Sets a custom effect on all keyboards.
     * @param layout The layout to set the effect to.
     */
    void customKeyboardEffect(Colour[][] layout);

    /**
     * Sets a wave effect on all keyboards.
     * @param direction The direction of the wave.
     */
    void waveKeyboardEffect(WaveDirection direction);

    /**
     * Clears the effect on all mice.
     * This turns off all the LEDs on the mouse.
     */
    void clearMouseEffect();

    /**
     * Sets a static effect on all mice.
     * @param colour The colour to set the effect to.
     */
    void staticMouseEffect(Colour colour);

    /**
     * Sets a custom effect on all mice.
     * @param layout The layout to set the effect to.
     */
    void customMouseEffect(Colour[][] layout);

    /**
     * Clears the effect on all headsets.
     * This turns off all the LEDs on the headset.
     */
    void clearHeadsetEffect();

    /**
     * Sets a static effect on all headsets.
     * @param colour The colour to set the effect to.
     */
    void staticHeadsetEffect(Colour colour);

    /**
     * Sets a custom effect on all headsets.
     * @param layout The layout to set the effect to.
     */
    void customHeadsetEffect(Colour[][] layout);

    /**
     * Clears the effect on all mousepads.
     * This turns off all the LEDs on the mousepad.
     */
    void clearMousepadEffect();

    /**
     * Sets a static effect on all mousepads.
     * @param colour The colour to set the effect to.
     */
    void staticMousepadEffect(Colour colour);

    /**
     * Sets a custom effect on all mousepads.
     * @param layout The layout to set the effect to.
     */
    void customMousepadEffect(Colour[][] layout);

    /**
     * Clears the effect on all keypads.
     * This turns off all the LEDs on the keypad.
     */
    void clearKeypadEffect();

    /**
     * Sets a static effect on all keypads.
     * @param colour The colour to set the effect to.
     */
    void staticKeypadEffect(Colour colour);

    /**
     * Sets a custom effect on all keypads.
     * @param layout The layout to set the effect to.
     */
    void customKeypadEffect(Colour[][] layout);

    /**
     * Clears the effect on all ChromaLink devices.
     * This turns off all the LEDs on the ChromaLink devices.
     */
    void clearChromaLinkEffect();

    /**
     * Sets a static effect on all ChromaLink devices.
     * @param colour The colour to set the effect to.
     */
    void staticChromaLinkEffect(Colour colour);

    /**
     * Sets a custom effect on all ChromaLink devices.
     * @param layout The layout to set the effect to.
     */
    void customChromaLinkEffect(Colour[][] layout);
}
