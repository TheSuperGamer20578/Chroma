package io.github.thesupergamer20578.chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.lighting.charging")
interface DBusLightingCharging extends DBusInterface {
    /**
     * Get the device's brightness
     * @return Brightness
     */
    float getChargingBrightness();

    /**
     * Set the device's brightness
     * @param brightness Brightness
     */
    void setChargingBrightness(byte brightness);

    /**
     * Set the wave effect on the device
     * @param direction (0|1) – down to up, (1|2) up to down.
     */
    void setChargingWave(byte direction);

    /**
     * Set the device to static colour
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     */
    void setChargingStatic(short red, short green, short blue);

    /**
     * Set the device to spectrum mode
     */
    void setChargingSpectrum();

    /**
     * Set the device to effect none
     */
    void setChargingNone();

    /**
     * Set the device to random colour breathing effect
     */
    void setChargingBreathRandom();

    /**
     * Set the device to single colour breathing effect
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     */
    void setChargingBreathSingle(short red, short green, short blue);

    /**
     * Set the device to dual-colour breathing effect
     * @param red1 Red component
     * @param green1 Green component
     * @param blue1 Blue component
     * @param red2 Red component
     * @param green2 Green component
     * @param blue2 Blue component
     */
    void setChargingBreathDual(short red1, short green1, short blue1, short red2, short green2, short blue2);
}
