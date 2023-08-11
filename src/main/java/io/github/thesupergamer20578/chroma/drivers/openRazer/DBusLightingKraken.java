package io.github.thesupergamer20578.chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.lighting.kraken")
interface DBusLightingKraken extends DBusInterface {
    /**
     * Set custom colour on kraken
     * @param rgbi
     */
    void setCustom(short[] rgbi);
}
