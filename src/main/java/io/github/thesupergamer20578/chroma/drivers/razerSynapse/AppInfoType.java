package io.github.thesupergamer20578.chroma.drivers.razerSynapse;

import com.sun.jna.Structure;
import io.github.thesupergamer20578.chroma.ApplicationInfo;
import io.github.thesupergamer20578.chroma.DeviceType;
import org.jetbrains.annotations.NotNull;

@Structure.FieldOrder({"Title", "Description", "AuthorName", "AuthorContact", "SupportedDevice", "Category"})
public class AppInfoType extends Structure {
    public char[] Title = new char[256];
    public char[] Description = new char[1024];
    public char[] AuthorName = new char[256];
    public char[] AuthorContact = new char[256];
    public int SupportedDevice;
    public int Category;

    private void setString(char @NotNull [] array, @NotNull CharSequence string) {
        if (string.length() > array.length) {
            throw new IllegalArgumentException("String is too long");
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = i < string.length() ? string.charAt(i) : 0;
        }
    }

    /**
     * Creates a new AppInfoType from an ApplicationInfo
     * @param info The ApplicationInfo to create from
     * @throws IllegalArgumentException If the ApplicationInfo contains {@link DeviceType#UNKNOWN}
     * @see ApplicationInfo
     */
    AppInfoType(ApplicationInfo info) {
        setString(Title, info.title);
        setString(Description, info.description);
        setString(AuthorName, info.authorName);
        setString(AuthorContact, info.authorContact);
        SupportedDevice = 0;
        for (DeviceType device : info.supportedDevices) {
            SupportedDevice |= (byte) switch (device) {
                case KEYBOARD -> 0x01;
                case MOUSE -> 0x02;
                case HEADSET -> 0x04;
                case MOUSEPAD -> 0x08;
                case KEYPAD -> 0x10;
                case CHROMA_LINK -> 0x20;
                case UNKNOWN -> throw new IllegalArgumentException("Unknown device type");
            };
        }
        Category = switch (info.category) {
            case APPLICATION -> 1;
            case GAME -> 2;
        };
    }
}
