package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.scroll")
interface DBusDeviceScroll extends DBusInterface {
    /**
     * Set the device's scroll mode
     * @param mode The mode to set (0 = tactile, 1 = free spin)
     */
    void setScrollMode(byte mode);

    /**
     * Get the device's scroll mode
     * @return The mode (0 = tactile, 1 = free spin)
     */
    byte getScrollMode();

    /**
     * Set the device's scroll acceleration state
     * @param enabled true to enable acceleration, false to disable it
     */
    void setScrollAcceleration(boolean enabled);

    /**
     * Get the device's scroll acceleration state
     * @return true if acceleration is enabled, false if it is disabled
     */
    boolean getScrollAcceleration();

    /**
     * Set the device's "smart reel" state
     * @param enabled true to enable smart reel, false to disable it
     */
    void setScrollSmartReel(boolean enabled);

    /**
     * Get the device's "smart reel" state
     * @return true if smart reel is enabled, false if it is disabled
     */
    boolean getScrollSmartReel();
}
