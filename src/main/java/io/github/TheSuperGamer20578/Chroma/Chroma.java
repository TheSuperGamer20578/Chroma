package io.github.TheSuperGamer20578.Chroma;

import io.github.TheSuperGamer20578.Chroma.drivers.Driver;
import io.github.TheSuperGamer20578.Chroma.drivers.openRazer.OpenRazer;
import org.apache.commons.lang3.SystemUtils;
import org.freedesktop.dbus.exceptions.DBusException;
import org.jetbrains.annotations.Nullable;

/**
 * The main class for Chroma used to hold the driver instance for the current platform.
 */
public class Chroma {
    private static Driver DRIVER;

    /**
     * Get the driver for the current platform.
     * @return The driver for the current platform, or null if there is no driver for the current platform.
     * @throws DBusException If running on linux and there is an error connecting to the OpenRazer DBus.
     */
    public static @Nullable Driver getDriver() throws DBusException {
        if (DRIVER != null) {
            return DRIVER;
        }

        if (SystemUtils.IS_OS_LINUX) {
            DRIVER = new OpenRazer();
            return DRIVER;
        }

        return null;
    }
}
