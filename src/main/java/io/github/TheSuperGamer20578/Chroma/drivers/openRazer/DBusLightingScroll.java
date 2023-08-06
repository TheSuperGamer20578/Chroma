package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.lighting.scroll")
interface DBusLightingScroll extends DBusInterface {
    /**
     * Get if the scroll is light up
     * @return
     */
    boolean getScrollActive();

    /**
     * Set if the scroll is light up
     * @param active
     */
    void setScrollActive(boolean active);

    /**
     * Get the device's brightness
     * @return
     */
    float getScrollBrightness();

    /**
     * Set the device's brightness
     * @param brightness
     */
    void setScrollBrightness(float brightness);

    /**
     * Set the device to static colour
     */
    void setScrollStaticMono();

    /**
     * Set the device to pulsate
     */
    void setScrollPulsateMono();

    /**
     * Set the wave effect on the device
     * @param direction (0|1) - down to up, (1|2) up to down
     */
    void setScrollWave(byte direction);

    /**
     * Set the device to static colour
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     */
    void setScrollStatic(short red, short green, short blue);

    /**
     * Set the device to spectrum mode
     */
    void setScrollSpectrum();

    /**
     * Set the device to effect none
     */
    void setScrollNone();

    /**
     * Set the device to effect on
     */
    void setScrollOn();

    /**
     * Set the device to reactive mode
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     * @param speed Speed
     */
    void setScrollReactive(short red, short green, short blue, byte speed);

    /**
     * Set the device to random colour breathing effect
     */
    void setScrollBreathRandom();

    /**
     * Set the device to single colour breathing effect
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     */
    void setScrollBreathSingle(short red, short green, short blue);

    /**
     * Set the device to dual colour breathing effect
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     * @param red2 Red component
     * @param green2 Green component
     * @param blue2 Blue component
     */
    void setScrollBreathDual(short red, short green, short blue, short red2, short green2, short blue2);

    /**
     * Set the device to blinking mode
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     */
    void setScrollBlinking(short red, short green, short blue);
}
