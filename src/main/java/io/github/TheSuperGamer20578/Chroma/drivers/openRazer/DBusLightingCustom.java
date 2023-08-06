package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.lighting.custom")
interface DBusLightingCustom extends DBusInterface {
    /**
     * Set the daemon to serve a ripple effect of the specified colour
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     * @param refresh_rate Refresh rate
     */
    void setRipple(short red, short green, short blue, byte refresh_rate);

    /**
     * Set the daemon to serve a ripple effect of random colours
     * @param refresh_rate Refresh rate
     */
    void setRippleRandomColour(byte refresh_rate);
}
