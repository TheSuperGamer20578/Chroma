package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.led.macromode")
interface DBusLedMacromode extends DBusInterface {
    /**
     * Get macro mode LED state
     * @return Status of macro mode
     */
    boolean getMacromode();

    /**
     * Set macro mode LED state
     * @param enable Status of macro mode
     */
    void setMacromode(boolean enable);

    /**
     * Get the effect on the macro LED
     * @return Macro LED effect ID
     */
    byte getMacroEffect();

    /**
     * Set the effect on the macro LED
     * @param effect Macro LED effect ID
     */
    void setMacroEffect(byte effect);
}
