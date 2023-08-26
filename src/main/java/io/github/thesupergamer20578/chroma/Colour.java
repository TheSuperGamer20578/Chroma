package io.github.thesupergamer20578.chroma;

import org.jetbrains.annotations.Nullable;

/**
 * Represents a colour
 */
public class Colour {
    /**
     * The red value of the colour
     */
    public short red;
    /**
     * The green value of the colour
     */
    public short green;
    /**
     * The blue value of the colour
     */
    public short blue;

    /**
     * Constructs a new colour from RGB values.
     * @param red Red value (0-255)
     * @param green Green value (0-255)
     * @param blue Blue value (0-255)
     */
    public Colour(short red, short green, short blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /**
     * Constructs a new colour from the int representation of the colour.
     * @param colour The int representation of the colour
     */
    public Colour(int colour) {
        red = (short) (colour >> 16);
        green = (short) (colour >> 8 & 0xff);
        blue = (short) (colour & 0xff);
    }

    /**
     * Converts the colour to a single int
     * @return The int representation of the colour
     */
    public int toInt() {
        return red << 16 | green << 8 | blue;
    }

    /**
     * Multiplies each of the colour channels by the multiplier.
     * This has the effect of making the colour brighter or darker.
     * @param multiplier The number to multiply by
     * @return The new colour
     */
    public Colour multiply(double multiplier) {
        return new Colour((byte) (red * multiplier), (byte) (green * multiplier), (byte) (blue * multiplier));
    }

    /**
     * Creates a new colour by averaging the colour channels of this colour and the other colour.
     * @param other The colour to tint by
     * @return The new colour, or this colour if the other colour is null.
     */
    public Colour tint(@Nullable Colour other) {
        if (other == null) {
            return this;
        }
        return new Colour((short) ((red + other.red) / 2), (short) ((green + other.green) / 2), (short) ((blue + other.blue) / 2));
    }
}
