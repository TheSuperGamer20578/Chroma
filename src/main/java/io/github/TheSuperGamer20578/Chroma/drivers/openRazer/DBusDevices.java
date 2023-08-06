package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.devices")
interface DBusDevices extends DBusInterface {
    String[] getDevices();
    boolean getSyncEffects();
    String supportedDevices();
    void enableTurnOffOnScreensaver(boolean enable);
    boolean getTurnOffOnScreensaver();
    void syncEffects();
}
