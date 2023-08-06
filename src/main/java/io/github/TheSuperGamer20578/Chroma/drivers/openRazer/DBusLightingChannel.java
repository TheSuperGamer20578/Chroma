package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.lighting.channel")
interface DBusLightingChannel extends DBusInterface {
    byte getNumChannels();

    /**
     * Get the channel brightness
     * @param channel Channel number to get the brightness of
     * @return Brightness
     */
    float getChannelBrightness(byte channel);

    /**
     * Set the device's brightness
     * @param channel Channel
     * @param brightness Brightness
     */
    void setChannelBrightness(byte channel, byte brightness);

    /**
     * Get the device's size
     * @param channel Channel
     * @return Size
     */
    float getChannelSize(byte channel);

    /**
     * Set the device's size
     * @param channel Channel
     * @param size Size
     */
    void setChannelSize(byte channel, byte size);
}
