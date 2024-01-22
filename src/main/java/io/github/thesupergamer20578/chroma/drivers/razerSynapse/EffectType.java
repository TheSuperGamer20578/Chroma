package io.github.thesupergamer20578.chroma.drivers.razerSynapse;

@CEnum.StartAt(0)
enum EffectType implements CEnum<EffectType> {
    /**
     * No effect.
     */
    NONE,
    /**
     * Wave effect.
     * @deprecated in the Razer Chroma SDK
     */
    @Deprecated
    WAVE,
    /**
     * Spectrum cycling effect.
     * @deprecated in the Razer Chroma SDK
     */
    @Deprecated
    SPECTRUM_CYCLING,
    /**
     * Breathing effect.
     * @deprecated in the Razer Chroma SDK
     */
    @Deprecated
    BREATHING,
    /**
     * Blinking effect.
     * @deprecated in the Razer Chroma SDK
     */
    @Deprecated
    BLINKING,
    /**
     * Reactive effect.
     * @deprecated in the Razer Chroma SDK
     */
    @Deprecated
    REACTIVE,
    /**
     * Static single colour effect.
     */
    STATIC,
    /**
     * Custom effect. For mice, please see Mouse::CHROMA_CUSTOM2.
     */
    CUSTOM,
    /**
     * @deprecated Reserved, don't use.
     */
    @Deprecated
    CUSTOM2,
    /**
     * @deprecated Reserved, don't use.
     */
    @Deprecated
    RESERVED,
    /**
     * Invalid effect.
     */
    INVALID;

    @CEnum.StartAt(0)
    enum Keyboard implements CEnum<Keyboard> {
        /**
         * No effect.
         */
        NONE,
        /**
         * Breathing effect.
         * @deprecated in the Razer Chroma SDK
         */
        @Deprecated
        BREATHING,
        /**
         * Custom effect.
         */
        CUSTOM,
        /**
         * Reactive effect.
         */
        @Deprecated
        REACTIVE,
        /**
         * Static single colour effect.
         */
        STATIC,
        /**
         * Spectrum cycling effect.
         * @deprecated in the Razer Chroma SDK
         */
        @Deprecated
        SPECTRUM_CYCLING,
        /**
         * Wave effect.
         * @deprecated in the Razer Chroma SDK
         */
        @Deprecated
        WAVE,
        /**
         * @deprecated Reserved, don't use.
         */
        @Deprecated
        RESERVED,
        /**
         * Custom effects with keys.
         */
        CUSTOM_KEY,
        /**
         * Custom effects with keys using 8x24 grid.
         */
        CUSTOM2,
        /**
         * Invalid effect.
         */
        INVALID,
    }

    @CEnum.StartAt(0)
    enum Mouse implements CEnum<Mouse> {
        /**
         * No effect.
         */
        NONE,
        /**
         * Blinking effect.
         * @deprecated in the Razer Chroma SDK
         */
        @Deprecated
        BLINKING,
        @Deprecated
        BREATHING,           // Breathing effect (Deprecated and should not be used).
        @Deprecated
        CUSTOM,              // Custom effect type (Deprecated and should not be used).
        @Deprecated
        REACTIVE,            // Reactive effect (Deprecated and should not be used).
        @Deprecated
        SPECTRUM_CYCLING,     // Spectrum cycling effect (Deprecated and should not be used).
        STATIC,
        @Deprecated
        WAVE,                // Wave effect (Deprecated and should not be used).
        CUSTOM2,
        STATIC2,
        INVALID,
    }

    @CEnum.StartAt(0)
    enum Headset implements CEnum<Headset> {
        NONE,
        STATIC,
        @Deprecated
        BREATHING,           // Breathing effect (Deprecated and should not be used).
        @Deprecated
        SPECTRUM_CYCLING,     // Spectrum cycling effect (Deprecated and should not be used).
        CUSTOM,
        INVALID,
    }

    @CEnum.StartAt(0)
    enum Mousepad implements CEnum<Mousepad> {
        NONE,
        @Deprecated
        BREATHING,           // Breathing effect (Deprecated and should not be used).
        CUSTOM,
        @Deprecated
        SPECTRUM_CYCLING,     // Spectrum cycling effect (Deprecated and should not be used).
        STATIC,
        @Deprecated
        WAVE,                // Wave effect (Deprecated and should not be used).
        CUSTOM2,
        INVALID,
    }

    @CEnum.StartAt(0)
    enum Keypad implements CEnum<Keypad> {
        NONE,
        @Deprecated
        BREATHING,           // Breathing effect (Deprecated and should not be used).
        CUSTOM,
        @Deprecated
        REACTIVE,            // Reactive effect (Deprecated and should not be used).
        @Deprecated
        SPECTRUM_CYCLING,     // Spectrum cycling effect (Deprecated and should not be used).
        STATIC,
        @Deprecated
        WAVE,                // Wave effect (Deprecated and should not be used).
        INVALID,
    }

    @CEnum.StartAt(0)
    enum ChromaLink implements CEnum<ChromaLink> {
        NONE,
        CUSTOM,
        STATIC,
        INVALID,
    }
}
