package io.github.thesupergamer20578.chroma.drivers.razerSynapse;

import com.sun.jna.Structure;
import io.github.thesupergamer20578.chroma.Colour;

import java.util.Arrays;

@Structure.FieldOrder({"Colours"})
public class CustomEffectStruct extends Structure {
    public final ColourStruct[][] Colours;

    CustomEffectStruct(ColourStruct[][] layout) {
        Colours = layout;
    }

    CustomEffectStruct(Colour[][] layout) {
        this(Arrays.stream(layout)
                .map(r -> Arrays.stream(r)
                        .map(ColourStruct::new)
                        .toArray(ColourStruct[]::new))
                .toArray(ColourStruct[][]::new));
    }
}
