package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.lighting.bw2013")
interface DBusLightingBW2013 extends DBusInterface {
    /**
     * Set pulsate mode
     */
    void setPulsate();

    /**
     * Set static mode
     */
    void setStatic();
}
