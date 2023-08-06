package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.macro")
interface DBusDeviceMacro extends DBusInterface {
    /**
     * Get if the mode key is a modifier
     * @return State
     */
    boolean getModeModifier();

    /**
     * Set if the mode key is a modifier
     * @param modifier State
     */
    void setModeModifier(boolean modifier);

    /**
     * Get macros
     * @return JSON of macros
     */
    String getMacros();

    /**
     * Delete macro from key
     * @param macro_key Macro key to delete bound macro from
     */
    void deleteMacro(String macro_key);

    /**
     * Add macro to key
     * <p>
     * The macro_json should be JSON form of a list of dictionaries
     * @param macro_bind_key Macro key to delete bound macro from
     * @param macro_json JSON list
     */
    void addMacro(String macro_bind_key, String macro_json);
}
