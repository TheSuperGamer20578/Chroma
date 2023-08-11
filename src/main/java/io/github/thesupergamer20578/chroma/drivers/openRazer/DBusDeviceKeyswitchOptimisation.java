package io.github.thesupergamer20578.chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.misc.keyswitchoptimisation")
interface DBusDeviceKeyswitchOptimisation extends DBusInterface {
    /**
     * Get the device's keyswitch optimisation state
     * @return Key switch optimisation state
     */
    boolean getKeyswitchOptimisation();

    /**
     * Set the device's keyswitch optimisation state
     * @param enable Key switch optimisation state
     */
    void setKeyswitchOptimisation(boolean enable);
}
