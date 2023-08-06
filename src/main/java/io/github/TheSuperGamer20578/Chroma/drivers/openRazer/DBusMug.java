package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.misc.mug")
interface DBusMug extends DBusInterface {
    /**
     * Get if the mug is present
     * @return True if there's a mug
     */
    boolean isMugPresent();
}
