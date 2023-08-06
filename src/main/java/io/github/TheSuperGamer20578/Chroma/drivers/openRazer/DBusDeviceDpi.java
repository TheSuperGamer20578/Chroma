package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

import org.freedesktop.dbus.Tuple;
import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

@DBusInterfaceName("razer.device.dpi")
interface DBusDeviceDpi extends DBusInterface {
    /**
     * Set the DPI on the mouse, Takes in 4 bytes big-endian
     * @param dpi_x X DPI
     * @param dpi_y Y DPI
     */
    void setDPI(int dpi_x, int dpi_y);

    /**
     * Get the DPI on the mouse
     * @return DPI List of X, Y DPI
     */
    int[] getDPI();

    /**
     * Set the DPI on the mouse, Takes in pairs of 2 bytes big-endian
     * @param active_stage DPI stage to enable
     * @param dpi_stages pairs of dpi X and dpi Y for each stage
     */
    void setDPIStages(byte active_stage, Tuple2<Integer, Integer>[] dpi_stages);

    /**
     * Get the DPI stages on the mouse
     * @return List of X, Y DPI
     */
    Tuple2<Integer, Tuple2<Integer, Integer>[]> getDPIStages();

    /**
     * Get the maximum DPI on the mouse
     * @return Maximum DPI
     */
    int maxDPI();

    /**
     * Get available DPI values
     * @return Array of available DPI values
     */
    int[] availableDPI();
}
