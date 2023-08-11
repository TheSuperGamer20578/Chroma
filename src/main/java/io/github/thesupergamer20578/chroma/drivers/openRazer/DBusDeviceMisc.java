package io.github.thesupergamer20578.chroma.drivers.openRazer;

import org.freedesktop.dbus.Tuple;
import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.interfaces.DBusInterface;

import java.util.Map;

@DBusInterfaceName("razer.device.misc")
interface DBusDeviceMisc extends DBusInterface {
    String getDeviceMode();
    void resumeDevice();
    boolean hasDedicatedMacroKeys();
    void suspendDevice();

    /**
     * Get the devices driver version
     * @return Get driver version string like 1.0.7
     */
    String getDriverVersion();
    Tuple getVidPid();
    void setDeviceMode(byte mode_id, byte param);
    String getSerial();
    Map<String, String> getRazerUrls();
    String getDeviceImage();

    /**
     * Get the devices firmware version
     * @return Get firmware string like v1.1
     */
    String getFirmware();

    /**
     * If the device has an LED matrix
     */
    int[] getMatrixDimensions();

    /**
     * If the device has an LED matrix
     */
    boolean hasMatrix();

    /**
     * Get the device's descriptive string
     * @return Device string like 'BlackWidow Ultimate 2013'
     */
    String getDeviceName();

    /**
     * Get the device's type
     */
    String getDeviceType();

    /**
     * Get the device's keyboard layout
     * @return String like 'en_US', 'de_DE', 'en_GB' or 'unknown'
     */
    String getKeyboardLayout();

    /**
     * Trigger reactive on Firefly
     */
    void triggerReactive();

    /**
     * Set the polling rate on the device, Takes in 4 bytes big-endian
     * @param rate Poll rate
     */
    void setPollRate(int rate);

    /**
     * Get the polling rate from the device
     * @return Poll rate
     */
    int getPollRate();

    /**
     * Get the polling rates supported by the device
     * @return Supported poll rates
     */
    int[] getSupportedPollRates();

    /**
     * Set the function of the LED on the dongle, takes in 1 char
     * 1 = Connection Status (green if connected to mouse)
     * 2 = Battery Status (green if high battery, yellow if medium battery, red if low battery)
     * 3 = Battery Warning (red if low battery, off otherwise)
     * @param mode LED mode
     */
    void setHyperPollingLED(byte mode);

    /**
     * Set Pairing mode, takes in 1 string which is the PID
     * @param pid product id
     */
    void setHyperPollingPair(String pid);

    /**
     * Set Unpairing mode, takes in 1 string which is the PID
     * @param pid product id
     */
    void setHyperPollingUnpair(String pid);
}
