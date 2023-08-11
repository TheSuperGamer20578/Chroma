package io.github.thesupergamer20578.chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.power")
interface DBusDevicePower extends DBusInterface {
    /**
     * Get mouse's battery level
     * @return
     */
    float getBattery();

    /**
     * Get charging status
     * @return
     */
    boolean getCharging();

    /**
     * Set the idle time of the mouse in seconds
     * @param idle_time Idle time in seconds (unsigned short)
     */
    void setIdleTime(short idle_time);

    /**
     * Get the idle time of the mouse in seconds
     * @return Idle time in seconds (unsigned short)
     */
    short getIdleTime();

    /**
     * Set the low battery threshold as a percentage
     * @param threshold Battery threshold as a percentage
     */
    void setLowBatteryThreshold(byte threshold);

    /**
     * Get the low battery threshold as a percentage
     * @return Battery threshold as a percentage
     */
    byte getLowBatteryThreshold();
}
