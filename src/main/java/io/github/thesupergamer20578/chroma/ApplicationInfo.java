package io.github.thesupergamer20578.chroma;

public class ApplicationInfo {
    public String title;
    public String description;
    public String authorName;
    public String authorContact;
    public DeviceType[] supportedDevices;
    public Category category;

    public ApplicationInfo(String title, String description, String authorName, String authorContact, DeviceType[] supportedDevices, Category category) {
        this.title = title;
        this.description = description;
        this.authorName = authorName;
        this.authorContact = authorContact;
        this.supportedDevices = supportedDevices;
        this.category = category;
    }
}
