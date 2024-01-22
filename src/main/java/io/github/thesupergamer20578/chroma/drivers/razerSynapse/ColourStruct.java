package io.github.thesupergamer20578.chroma.drivers.razerSynapse;

import com.sun.jna.Structure;
import io.github.thesupergamer20578.chroma.Colour;
import org.jetbrains.annotations.NotNull;

//@Structure.FieldOrder({"blue", "green", "red"})
@Structure.FieldOrder({"colour"})
public class ColourStruct extends Structure implements Structure.ByReference {
//    public final byte red;
//    public final byte green;
//    public final byte blue;
    public final int colour;

    ColourStruct(@NotNull Colour colour) {
        this.colour = 0x88888888;
//        red = (byte) colour.red;
//        green = (byte) colour.green;
//        blue = (byte) colour.blue;
    }
}
