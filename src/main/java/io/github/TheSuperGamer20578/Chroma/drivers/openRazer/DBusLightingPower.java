package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.lighting.power")
interface DBusLightingPower extends DBusInterface {
    /**
     * Set the charging effect.
     * <p>
     * If 0x00 then it will use the current mouse's effect
     * If 0x01 it will use the charge colour
     * @param charge_effect Charge effect
     */
    void setChargeEffect(byte charge_effect);

    /**
     * Set the charge colour
     * @param red Red component
     * @param green Green component
     * @param blue Blue component
     */
    void setChargeColour(short red, short green, short blue);
}
