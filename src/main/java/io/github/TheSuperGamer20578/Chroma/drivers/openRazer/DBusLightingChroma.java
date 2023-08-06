package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.lighting.chroma")
interface DBusLightingChroma extends DBusInterface {
    void restoreLastEffect();
    byte[] getEffectColors();
    String getEffect();
    byte getWaveDir();
    double getEffectSpeed();

    /**
     * Set the wave effect on the device
     * @param direction 1 - left to right, 2 right to left
     */
    void setWave(byte direction);

    /**
     * Set the device to static colour
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     */
    void setStatic(short red, short green, short blue);

    /**
     * Set the device to spectrum mode
     */
    void setSpectrum();

    /**
     * Set the device to reactive effect
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     * @param speed Speed
     */
    void setReactive(short red, short green, short blue, byte speed);

    /**
     * Set the device to effect none
     */
    void setNone();

    /**
     * Set the device to random colour breathing effect
     */
    void setBreathRandom();

    /**
     * Set the device to single colour breathing effect
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     */
    void setBreathSingle(short red, short green, short blue);

    /**
     * Set the device to dual-colour breathing effect
     * @param red1 Red component
     * @param green1 Green component
     * @param blue1 Blue component
     * @param red2 Red component
     * @param green2 Green component
     * @param blue2 Blue component
     */
    void setBreathDual(short red1, short green1, short blue1, short red2, short green2, short blue2);

    /**
     * Set the device to triple-colour breathing effect
     * @param red1 Red component
     * @param green1 Green component
     * @param blue1 Blue component
     * @param red2 Red component
     * @param green2 Green component
     * @param blue2 Blue component
     * @param red3 Red component
     * @param green3 Green component
     * @param blue3 Blue component
     */
    void setBreathTriple(short red1, short green1, short blue1, short red2, short green2, short blue2, short red3, short green3, short blue3);

    /**
     * Set the device to use custom LED matrix
     */
    void setCustom();

    /**
     * Set the RGB matrix on the device
     * <p>
     * Byte array like
     * [1, 255, 255, 00, 255, 255, 00, 255, 255, 00, 255, 255, 00, 255, 255, 00, 255, 255, 00, 255, 255, 00, 255, 255, 00,
     *     255, 255, 00, 255, 255, 00, 255, 255, 00, 255, 255, 00, 255, 255, 00, 255, 255, 00, 255, 00, 00]
     * <p>
     * First byte is row, on firefly its always 1, on keyboard its 0-5
     * Then its 3byte groups of RGB
     * @param payload Binary payload
     */
    void setKeyRow(byte[] payload);

    /**
     * Set startlight random mode
     * @param speed
     */
    void setStarlightRandom(byte speed);

    /**
     * Set startlight mode
     * @param red
     * @param green
     * @param blue
     * @param speed
     */
    void setStarlightSingle(short red, short green, short blue, byte speed);

    /**
     * Set startlight dual mode
     * @param red1
     * @param green1
     * @param blue1
     * @param red2
     * @param green2
     * @param blue2
     * @param speed
     */
    void setStarlightDual(short red1, short green1, short blue1, short red2, short green2, short blue2, byte speed);

    /**
     * Set the device to static colour
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     */
    void setBlinking(short red, short green, short blue);
}
