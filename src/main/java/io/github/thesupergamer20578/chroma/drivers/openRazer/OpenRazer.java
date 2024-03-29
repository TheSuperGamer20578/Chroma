package io.github.thesupergamer20578.chroma.drivers.openRazer;

import io.github.thesupergamer20578.chroma.Chroma;
import io.github.thesupergamer20578.chroma.Colour;
import io.github.thesupergamer20578.chroma.DeviceType;
import io.github.thesupergamer20578.chroma.WaveDirection;
import io.github.thesupergamer20578.chroma.drivers.Driver;
import org.freedesktop.dbus.connections.impl.DBusConnection;
import org.freedesktop.dbus.connections.impl.DBusConnectionBuilder;
import org.freedesktop.dbus.exceptions.DBusException;

import java.util.ArrayList;
import java.util.List;

/**
 * The OpenRazer driver for Linux systems.
 */
public class OpenRazer implements Driver {
    static final String BUS = "org.razer";
    static final String PATH = "/org/razer";
    private final DBusConnection dbus;
    private final List<Device> devices = new ArrayList<>();

    /**
     * Instantiates the OpenRazer driver.
     * {@link Chroma#getDriver()} should be used in most cases instead.
     * @throws DBusException If there's an error connecting to the OpenRazer DBus.
     */
    public OpenRazer() throws DBusException {
        dbus = DBusConnectionBuilder.forSessionBus().build();
        for (String serial : dbus.getRemoteObject(BUS, PATH, DBusDevices.class).getDevices()) {
            addDevice(serial);
        }
    }

    private void addDevice(String serial) throws DBusException {
        devices.add(new Device(dbus, serial));
    }

    @Override
    public void shutdown() {
        dbus.disconnect();
    }

    @Override
    public void clearKeyboardEffect() {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.KEYBOARD) continue;
            device.clearEffect();
        }
    }

    @Override
    public void staticKeyboardEffect(Colour colour) {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.KEYBOARD) continue;
            device.staticEffect(colour);
        }
    }

    @Override
    public void customKeyboardEffect(Colour[][] layout) {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.KEYBOARD) continue;
            device.customEffect(layout);
        }
    }

    @Override
    public void waveKeyboardEffect(WaveDirection direction) {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.KEYBOARD) continue;
            device.waveEffect(direction);
        }
    }


    @Override
    public void clearMouseEffect() {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.MOUSE) continue;
            device.clearEffect();
        }
    }

    @Override
    public void staticMouseEffect(Colour colour) {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.MOUSE) continue;
            device.staticEffect(colour);
        }
    }

    @Override
    public void customMouseEffect(Colour[][] layout) {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.MOUSE) continue;
            device.customEffect(layout);
        }
    }


    @Override
    public void clearHeadsetEffect() {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.HEADSET) continue;
            device.clearEffect();
        }
    }

    @Override
    public void staticHeadsetEffect(Colour colour) {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.HEADSET) continue;
            device.staticEffect(colour);
        }
    }

    @Override
    public void customHeadsetEffect(Colour[][] layout) {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.HEADSET) continue;
            device.customEffect(layout);
        }
    }


    @Override
    public void clearMousepadEffect() {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.MOUSEPAD) continue;
            device.clearEffect();
        }
    }

    @Override
    public void staticMousepadEffect(Colour colour) {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.MOUSEPAD) continue;
            device.staticEffect(colour);
        }
    }

    @Override
    public void customMousepadEffect(Colour[][] layout) {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.MOUSEPAD) continue;
            device.customEffect(layout);
        }
    }


    @Override
    public void clearKeypadEffect() {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.KEYPAD) continue;
            device.clearEffect();
        }
    }

    @Override
    public void staticKeypadEffect(Colour colour) {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.KEYPAD) continue;
            device.staticEffect(colour);
        }
    }

    @Override
    public void customKeypadEffect(Colour[][] layout) {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.KEYPAD) continue;
            device.customEffect(layout);
        }
    }


    @Override
    public void clearChromaLinkEffect() {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.CHROMA_LINK) continue;
            device.clearEffect();
        }
    }

    @Override
    public void staticChromaLinkEffect(Colour colour) {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.CHROMA_LINK) continue;
            device.staticEffect(colour);
        }
    }

    @Override
    public void customChromaLinkEffect(Colour[][] layout) {
        for (Device device : devices) {
            if (device.getDeviceType() != DeviceType.CHROMA_LINK) continue;
            device.customEffect(layout);
        }
    }
}
