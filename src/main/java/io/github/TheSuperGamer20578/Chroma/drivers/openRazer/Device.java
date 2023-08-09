package io.github.TheSuperGamer20578.Chroma.drivers.openRazer;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.connections.impl.DBusConnection;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.interfaces.Introspectable;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Device {
    public final Capability[] capabilities;
    public final String serial;
    private final @Nullable DBusDeviceDpi dpiDBus;
    private final @Nullable DBusDeviceKeyswitchOptimisation keyswitchOptimisationDBus;
    private final @Nullable DBusDeviceMacro macroDBus;
    private final DBusDeviceMisc miscDBus;
    private final @Nullable DBusDevicePower powerDBus;
    private final @Nullable DBusDeviceScroll scrollDBus;
    private final @Nullable DBusLedGamemode gamemodeDBus;
    private final @Nullable DBusLedMacromode macromodeDBus;
    private final @Nullable DBusLightingBacklight backlightDBus;
    private final @Nullable DBusLightingBrightness brightnessDBus;
    private final @Nullable DBusLightingBW2013 bw2013DBus;
    private final @Nullable DBusLightingChannel lightingChannelDBus;
    private final @Nullable DBusLightingCharging chargingDBus;
    private final @Nullable DBusLightingChroma chromaDBus;
    private final @Nullable DBusLightingCustom customDBus;
    private final @Nullable DBusLightingFastCharging fastChargingDBus;
    private final @Nullable DBusLightingFullyCharged fullyChargedDBus;
    private final @Nullable DBusLightingKraken krakenDBus;
    private final @Nullable DBusLightingLeft leftDBus;
    private final @Nullable DBusLightingLogo logoDBus;
    private final @Nullable DBusLightingPower powerLightingDBus;
    private final @Nullable DBusLightingProfileLed profileLedDBus;
    private final @Nullable DBusLightingRight rightDBus;
    private final @Nullable DBusLightingScroll scrollLightingDBus;
    private final @Nullable DBusMug mugDBus;

    Device(DBusConnection dbus, String serial) throws DBusException {
        this.serial = serial;
        Document introspection;
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setValidating(false);
            //noinspection HttpUrlsUsage
            documentBuilderFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            introspection = documentBuilderFactory.newDocumentBuilder()
                    .parse(new ByteArrayInputStream(
                            dbus.getRemoteObject(OpenRazer.BUS, OpenRazer.PATH + "/device/" + serial, Introspectable.class)
                                    .Introspect()
                                    .getBytes()
                    ));
        } catch (SAXException | IOException | ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
        introspection.getDocumentElement().normalize();
        NodeList interfaces = introspection.getElementsByTagName("interface");
        Map<String, Set<String>> supportedMethods = new HashMap<>();
        for (byte i = 0; i < interfaces.getLength(); i++) {
            Node item = interfaces.item(i);
            String interfaceName = item.getAttributes().getNamedItem("name").getTextContent();
            supportedMethods.put(interfaceName, new HashSet<>());
            NodeList children = item.getChildNodes();
            for (byte j = 0; j < children.getLength(); j++) {
                Node child = children.item(j);
                if (child.getNodeName().equals("method")) {
                    supportedMethods.get(interfaceName).add(child.getAttributes().getNamedItem("name").getTextContent());
                }
            }
        }
        capabilities = Arrays.stream(Capability.values()).filter(capability -> {
            if (capability.hasCapability) return true;
            assert capability.dBusInterface != null;
            String interfaceName = capability.dBusInterface.getAnnotation(DBusInterfaceName.class).value();
            if (!supportedMethods.containsKey(interfaceName)) return false;
            if (capability.methods == null) return true;
            for (String method : capability.methods) {
                if (!supportedMethods.get(interfaceName).contains(method)) return false;
            }
            if (capability.value != null) {
                assert capability.methods.length == 1;
                DBusInterface dBusInterface;
                try {
                    dBusInterface = dbus.getRemoteObject(OpenRazer.BUS, OpenRazer.PATH + "/device/" + serial, capability.dBusInterface);
                } catch (DBusException e) {
                    throw new RuntimeException(e);
                }
                try {
                    return capability.dBusInterface.getMethod(capability.methods[0]).invoke(dBusInterface) == capability.value;
                } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                    throw new RuntimeException(e);
                }
            }
            return true;
        }).toArray(Capability[]::new);

        class Local {
            public <T extends DBusInterface> @Nullable T getDBusInterface(Class<T> dBusInterface) {
                try {
                    return dbus.getRemoteObject(OpenRazer.BUS, OpenRazer.PATH + "/device/" + serial, dBusInterface);
                } catch (DBusException e) {
                    return null;
                }
            }
        }
        Local local = new Local();
        dpiDBus = local.getDBusInterface(DBusDeviceDpi.class);
        backlightDBus = local.getDBusInterface(DBusLightingBacklight.class);
        brightnessDBus = local.getDBusInterface(DBusLightingBrightness.class);
        bw2013DBus = local.getDBusInterface(DBusLightingBW2013.class);
        chargingDBus = local.getDBusInterface(DBusLightingCharging.class);
        chromaDBus = local.getDBusInterface(DBusLightingChroma.class);
        customDBus = local.getDBusInterface(DBusLightingCustom.class);
        fastChargingDBus = local.getDBusInterface(DBusLightingFastCharging.class);
        fullyChargedDBus = local.getDBusInterface(DBusLightingFullyCharged.class);
        gamemodeDBus = local.getDBusInterface(DBusLedGamemode.class);
        keyswitchOptimisationDBus = local.getDBusInterface(DBusDeviceKeyswitchOptimisation.class);
        krakenDBus = local.getDBusInterface(DBusLightingKraken.class);
        leftDBus = local.getDBusInterface(DBusLightingLeft.class);
        lightingChannelDBus = local.getDBusInterface(DBusLightingChannel.class);
        logoDBus = local.getDBusInterface(DBusLightingLogo.class);
        macromodeDBus = local.getDBusInterface(DBusLedMacromode.class);
        macroDBus = local.getDBusInterface(DBusDeviceMacro.class);
        miscDBus = local.getDBusInterface(DBusDeviceMisc.class);
        mugDBus = local.getDBusInterface(DBusMug.class);
        powerDBus = local.getDBusInterface(DBusDevicePower.class);
        powerLightingDBus = local.getDBusInterface(DBusLightingPower.class);
        profileLedDBus = local.getDBusInterface(DBusLightingProfileLed.class);
        rightDBus = local.getDBusInterface(DBusLightingRight.class);
        scrollDBus = local.getDBusInterface(DBusDeviceScroll.class);
        scrollLightingDBus = local.getDBusInterface(DBusLightingScroll.class);
    }

    private void throwForCapability(Capability capability) throws CapabilityNotSupportedException {
        if (!hasCapability(capability)) {
            throw new CapabilityNotSupportedException(capability);
        }
    }

    public boolean hasCapability(Capability capability) {
        return Arrays.asList(capabilities).contains(capability);
    }
}
