package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.lighting.brightness")
interface DBusLightingBrightness extends DBusInterface {
    /**
     * Get the device's brightness
     * @return Brightness
     */
    float getBrightness();

    /**
     * Set the device's brightness
     * @param brightness Brightness
     */
    void setBrightness(byte brightness);
}
