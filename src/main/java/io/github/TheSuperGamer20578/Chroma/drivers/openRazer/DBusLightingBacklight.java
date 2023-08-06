package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.lighting.backlight")
interface DBusLightingBacklight extends DBusInterface {
    /**
     * Get if the backlight is lit up
     * @return
     */
    boolean getBacklightActive();

    /**
     * Set if the backlight is lit up
     * @param active
     */
    void setBacklightActive(boolean active);

    /**
     * Get the device's brightness
     * @return
     */
    float getBacklightBrightness();

    /**
     * Set the device's brightness
     * @param brightness
     */
    void setBacklightBrightness(float brightness);

    /**
     * Set the wave effect on the device
     * @param direction (0|1) - down to up, (1|2) up to down
     */
    void setBacklightWave(byte direction);

    /**
     * Set the device to static colour
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     */
    void setBacklightStatic(short red, short green, short blue);

    /**
     * Set the device to spectrum mode
     */
    void setBacklightSpectrum();

    /**
     * Set the device to effect none
     */
    void setBacklightNone();

    /**
     * Set the device to effect on
     */
    void setBacklightOn();

    /**
     * Set the device to reactive effect
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     * @param speed Speed
     */
    void setBacklightReactive(short red, short green, short blue, byte speed);

    /**
     * Set the device to random colour breathing effect
     */
    void setBacklightBreathRandom();

    /**
     * Set the device to single colour breathing effect
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     */
    void setBacklightBreathSingle(short red, short green, short blue);

    /**
     * Set the device to dual colour breathing effect
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     * @param red2 Red component
     * @param green2 Green component
     * @param blue2 Blue component
     */
    void setBacklightBreathDual(short red, short green, short blue, short red2, short green2, short blue2);
}
