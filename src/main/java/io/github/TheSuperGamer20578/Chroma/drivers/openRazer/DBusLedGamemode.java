package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.led.gamemode")
interface DBusLedGamemode extends DBusInterface {
    /**
     * Get game mode LED state
     * @return Game mode LED state
     */
    boolean getGamemode();

    /**
     * Set game mode LED state
     * @param enable Status of game mode
     */
    void setGamemode(boolean enable);
}
