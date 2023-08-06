package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.lighting.profile_led")
interface DBusLightingProfileLed extends DBusInterface {
    /**
     * Get red profile LED state
     * @return Red profile LED state
     */
    boolean getRedLED();

    /**
     * Set red profile LED state
     * @param enable Red profile LED state
     */
    void setRedLED(boolean enable);

    /**
     * Get green profile LED state
     * @return Green profile LED state
     */
    boolean getGreenLED();

    /**
     * Set green profile LED state
     * @param enable Green profile LED state
     */
    void setGreenLED(boolean enable);

    /**
     * Get blue profile LED state
     * @return Blue profile LED state
     */
    boolean getBlueLED();

    /**
     * Set blue profile LED state
     * @param enable Blue profile LED state
     */
    void setBlueLED(boolean enable);
}
