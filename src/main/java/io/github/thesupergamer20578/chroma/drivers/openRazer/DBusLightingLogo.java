package io.github.thesupergamer20578.chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.lighting.logo")
interface DBusLightingLogo extends DBusInterface {
    /**
     * Get the device's logo brightness
     * @return Logo brightness
     */
    float getLogoBrightness();

    /**
     * Set the device's logo brightness
     * @param brightness Logo brightness
     */
    void setLogoBrightness(float brightness);

    /**
     * Set the device to static colour
     */
    void setLogoStaticMono();

    /**
     * Set the device to pulsate
     */
    void setLogoPulsateMono();

    /**
     * Set the wave effect on the device
     * @param direction (0|1) - down to up, (1|2) up to down
     */
    void setLogoWave(byte direction);

    /**
     * Set the device to static colour
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     */
    void setLogoStatic(short red, short green, short blue);

    /**
     * Set the device to spectrum mode
     */
    void setLogoSpectrum();

    /**
     * Set the device to effect none
     */
    void setLogoNone();

    /**
     * Set the device to effect on
     */
    void setLogoOn();

    /**
     * Set the device to reactive mode
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     * @param speed Speed
     */
    void setLogoReactive(short red, short green, short blue, byte speed);

    /**
     * Set the device to random colour breathing effect
     */
    void setLogoBreathRandom();

    /**
     * Set the device to single colour breathing effect
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     */
    void setLogoBreathSingle(short red, short green, short blue);

    /**
     * Set the device to dual colour breathing effect
     * @param red1 Red component
     * @param green1 Green component
     * @param blue1 Blue component
     * @param red2 Red component
     * @param green2 Green component
     * @param blue2 Blue component
     */
    void setLogoBreathDual(short red1, short green1, short blue1, short red2, short green2, short blue2);

    /**
     * Set the device to blinking mode
     */
    void setLogoBlinkingMono();

    /**
     * Set the device to blinking mode
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     */
    void setLogoBlinking(short red, short green, short blue);
}
