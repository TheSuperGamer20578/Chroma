package io.github.thesupergamer20578.chroma.drivers.openRazer;

import org.freedesktop.dbus.interfaces.DBusInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum Capability {
    AVAILABLE_DPI(DBusDeviceDpi.class, "availableDPI"),
    BATTERY(DBusDevicePower.class, "getBattery"),
    BRIGHTNESS(DBusLightingBrightness.class),
    DPI(DBusDeviceDpi.class, "getDPI", "setDPI"),
    DPI_STAGES(DBusDeviceDpi.class, "getDPIStages", "setDPIStages"),
    FIRMWARE_VERSION(true),
    GAME_MODE_LED(DBusLedGamemode.class),
    GET_IDLE_TIME(DBusDevicePower.class, "getIdleTime"),
    GET_LOW_BATTERY_THRESHOLD(DBusDevicePower.class, "getLowBatteryThreshold"),
    KEYBOARD_LAYOUT(DBusDeviceMisc.class, "getKeyboardLayout"),
    KEYSWITCH_OPTIMISATION(DBusDeviceKeyswitchOptimisation.class, "getKeyswitchOptimisation", "setKeyswitchOptimisation"),
    LIGHTING(DBusLightingChroma.class),
    LIGHTING_BACKLIGHT(DBusLightingBacklight.class),
    LIGHTING_BACKLIGHT_ACTIVE(DBusLightingBacklight.class, "setBacklightActive"),
    LIGHTING_BACKLIGHT_BREATH_DUAL(DBusLightingBacklight.class, "setBacklightBreathDual"),
    LIGHTING_BACKLIGHT_BREATH_RANDOM(DBusLightingBacklight.class, "setBacklightBreathRandom"),
    LIGHTING_BACKLIGHT_BREATH_SINGLE(DBusLightingBacklight.class, "setBacklightBreathSingle"),
    LIGHTING_BACKLIGHT_BRIGHTNESS(DBusLightingBacklight.class, "setBacklightBrightness"),
    LIGHTING_BACKLIGHT_NONE(DBusLightingBacklight.class, "setBacklightNone"),
    LIGHTING_BACKLIGHT_ON(DBusLightingBacklight.class, "setBacklightOn"),
    LIGHTING_BACKLIGHT_REACTIVE(DBusLightingBacklight.class, "setBacklightReactive"),
    LIGHTING_BACKLIGHT_SPECTRUM(DBusLightingBacklight.class, "setBacklightSpectrum"),
    LIGHTING_BACKLIGHT_STATIC(DBusLightingBacklight.class, "setBacklightStatic"),
    LIGHTING_BACKLIGHT_WAVE(DBusLightingBacklight.class, "setBacklightWave"),
    LIGHTING_BLINKING(DBusLightingChroma.class, "setBlinking"),
    LIGHTING_BREATH_DUAL(DBusLightingChroma.class, "setBreathDual"),
    LIGHTING_BREATH_RANDOM(DBusLightingChroma.class, "setBreathRandom"),
    LIGHTING_BREATH_SINGLE(DBusLightingChroma.class, "setBreathSingle"),
    LIGHTING_BREATH_TRIPLE(DBusLightingChroma.class, "setBreathTriple"),
    LIGHTING_CHARGING(DBusLightingCharging.class),
    LIGHTING_CHARGING_ACTIVE(DBusLightingCharging.class, "setChargingActive"),
    LIGHTING_CHARGING_BREATH_DUAL(DBusLightingCharging.class, "setChargingBreathDual"),
    LIGHTING_CHARGING_BREATH_RANDOM(DBusLightingCharging.class, "setChargingBreathRandom"),
    LIGHTING_CHARGING_BREATH_SINGLE(DBusLightingCharging.class, "setChargingBreathSingle"),
    LIGHTING_CHARGING_BRIGHTNESS(DBusLightingCharging.class, "setChargingBrightness"),
    LIGHTING_CHARGING_NONE(DBusLightingCharging.class, "setChargingNone"),
    LIGHTING_CHARGING_SPECTRUM(DBusLightingCharging.class, "setChargingSpectrum"),
    LIGHTING_CHARGING_STATIC(DBusLightingCharging.class, "setChargingStatic"),
    LIGHTING_CHARGING_WAVE(DBusLightingCharging.class, "setChargingWave"),
    LIGHTING_FAST_CHARGING(DBusLightingFastCharging.class),
    LIGHTING_FAST_CHARGING_ACTIVE(DBusLightingFastCharging.class, "setFastChargingActive"),
    LIGHTING_FAST_CHARGING_BREATH_DUAL(DBusLightingFastCharging.class, "setFastChargingBreathDual"),
    LIGHTING_FAST_CHARGING_BREATH_RANDOM(DBusLightingFastCharging.class, "setFastChargingBreathRandom"),
    LIGHTING_FAST_CHARGING_BREATH_SINGLE(DBusLightingFastCharging.class, "setFastChargingBreathSingle"),
    LIGHTING_FAST_CHARGING_BRIGHTNESS(DBusLightingFastCharging.class, "setFastChargingBrightness"),
    LIGHTING_FAST_CHARGING_NONE(DBusLightingFastCharging.class, "setFastChargingNone"),
    LIGHTING_FAST_CHARGING_SPECTRUM(DBusLightingFastCharging.class, "setFastChargingSpectrum"),
    LIGHTING_FAST_CHARGING_STATIC(DBusLightingFastCharging.class, "setFastChargingStatic"),
    LIGHTING_FAST_CHARGING_WAVE(DBusLightingFastCharging.class, "setFastChargingWave"),
    LIGHTING_FULLY_CHARGED(DBusLightingFullyCharged.class),
    LIGHTING_FULLY_CHARGED_ACTIVE(DBusLightingFullyCharged.class, "setFullyChargedActive"),
    LIGHTING_FULLY_CHARGED_BREATH_DUAL(DBusLightingFullyCharged.class, "setFullyChargedBreathDual"),
    LIGHTING_FULLY_CHARGED_BREATH_RANDOM(DBusLightingFullyCharged.class, "setFullyChargedBreathRandom"),
    LIGHTING_FULLY_CHARGED_BREATH_SINGLE(DBusLightingFullyCharged.class, "setFullyChargedBreathSingle"),
    LIGHTING_FULLY_CHARGED_BRIGHTNESS(DBusLightingFullyCharged.class, "setFullyChargedBrightness"),
    LIGHTING_FULLY_CHARGED_NONE(DBusLightingFullyCharged.class, "setFullyChargedNone"),
    LIGHTING_FULLY_CHARGED_SPECTRUM(DBusLightingFullyCharged.class, "setFullyChargedSpectrum"),
    LIGHTING_FULLY_CHARGED_STATIC(DBusLightingFullyCharged.class, "setFullyChargedStatic"),
    LIGHTING_FULLY_CHARGED_WAVE(DBusLightingFullyCharged.class, "setFullyChargedWave"),
    LIGHTING_LED_MATRIX(DBusDeviceMisc.class, "hasMatrix", true),
    LIGHTING_LED_SINGLE(DBusLightingChroma.class, "setKey"),
    LIGHTING_LEFT(DBusLightingLeft.class),
    LIGHTING_LEFT_ACTIVE(DBusLightingLeft.class, "setLeftActive"),
    LIGHTING_LEFT_BREATH_DUAL(DBusLightingLeft.class, "setLeftBreathDual"),
    LIGHTING_LEFT_BREATH_RANDOM(DBusLightingLeft.class, "setLeftBreathRandom"),
    LIGHTING_LEFT_BREATH_SINGLE(DBusLightingLeft.class, "setLeftBreathSingle"),
    LIGHTING_LEFT_BRIGHTNESS(DBusLightingLeft.class, "setLeftBrightness"),
    LIGHTING_LEFT_NONE(DBusLightingLeft.class, "setLeftNone"),
    LIGHTING_LEFT_REACTIVE(DBusLightingLeft.class, "setLeftReactive"),
    LIGHTING_LEFT_SPECTRUM(DBusLightingLeft.class, "setLeftSpectrum"),
    LIGHTING_LEFT_STATIC(DBusLightingLeft.class, "setLeftStatic"),
    LIGHTING_LEFT_WAVE(DBusLightingLeft.class, "setLeftWave"),
    LIGHTING_LOGO(DBusLightingLogo.class),
    LIGHTING_LOGO_ACTIVE(DBusLightingLogo.class, "setLogoActive"),
    LIGHTING_LOGO_BLINKING(DBusLightingLogo.class, "setLogoBlinking"),
    LIGHTING_LOGO_BREATH_DUAL(DBusLightingLogo.class, "setLogoBreathDual"),
    LIGHTING_LOGO_BREATH_RANDOM(DBusLightingLogo.class, "setLogoBreathRandom"),
    LIGHTING_LOGO_BREATH_SINGLE(DBusLightingLogo.class, "setLogoBreathSingle"),
    LIGHTING_LOGO_BRIGHTNESS(DBusLightingLogo.class, "setLogoBrightness"),
    LIGHTING_LOGO_NONE(DBusLightingLogo.class, "setLogoNone"),
    LIGHTING_LOGO_ON(DBusLightingLogo.class, "setLogoOn"),
    LIGHTING_LOGO_PULSATE(DBusLightingLogo.class, "setLogoPulsate"),
    LIGHTING_LOGO_REACTIVE(DBusLightingLogo.class, "setLogoReactive"),
    LIGHTING_LOGO_SPECTRUM(DBusLightingLogo.class, "setLogoSpectrum"),
    LIGHTING_LOGO_STATIC(DBusLightingLogo.class, "setLogoStatic"),
    LIGHTING_LOGO_WAVE(DBusLightingLogo.class, "setLogoWave"),
    LIGHTING_NONE(DBusLightingChroma.class, "setNone"),
    LIGHTING_PROFILE_LED_BLUE(DBusLightingProfileLed.class, "setBlueLED"),
    LIGHTING_PROFILE_LED_GREEN(DBusLightingProfileLed.class, "setGreenLED"),
    LIGHTING_PROFILE_LED_RED(DBusLightingProfileLed.class, "setRedLED"),
    LIGHTING_PULSATE(DBusLightingBW2013.class, "setPulsate"),
    LIGHTING_REACTIVE(DBusLightingChroma.class, "setReactive"),
    LIGHTING_RIGHT(DBusLightingRight.class),
    LIGHTING_RIGHT_ACTIVE(DBusLightingRight.class, "setRightActive"),
    LIGHTING_RIGHT_BREATH_DUAL(DBusLightingRight.class, "setRightBreathDual"),
    LIGHTING_RIGHT_BREATH_RANDOM(DBusLightingRight.class, "setRightBreathRandom"),
    LIGHTING_RIGHT_BREATH_SINGLE(DBusLightingRight.class, "setRightBreathSingle"),
    LIGHTING_RIGHT_BRIGHTNESS(DBusLightingRight.class, "setRightBrightness"),
    LIGHTING_RIGHT_NONE(DBusLightingRight.class, "setRightNone"),
    LIGHTING_RIGHT_REACTIVE(DBusLightingRight.class, "setRightReactive"),
    LIGHTING_RIGHT_SPECTRUM(DBusLightingRight.class, "setRightSpectrum"),
    LIGHTING_RIGHT_STATIC(DBusLightingRight.class, "setRightStatic"),
    LIGHTING_RIGHT_WAVE(DBusLightingRight.class, "setRightWave"),
    LIGHTING_RIPPLE(DBusLightingCustom.class, "setRipple"),
    LIGHTING_RIPPLE_RANDOM(DBusLightingCustom.class, "setRippleRandomColour"),
    LIGHTING_SCROLL(DBusLightingScroll.class),
    LIGHTING_SCROLL_ACTIVE(DBusLightingScroll.class, "setScrollActive"),
    LIGHTING_SCROLL_BLINKING(DBusLightingScroll.class, "setScrollBlinking"),
    LIGHTING_SCROLL_BREATH_DUAL(DBusLightingScroll.class, "setScrollBreathDual"),
    LIGHTING_SCROLL_BREATH_RANDOM(DBusLightingScroll.class, "setScrollBreathRandom"),
    LIGHTING_SCROLL_BREATH_SINGLE(DBusLightingScroll.class, "setScrollBreathSingle"),
    LIGHTING_SCROLL_BRIGHTNESS(DBusLightingScroll.class, "setScrollBrightness"),
    LIGHTING_SCROLL_NONE(DBusLightingScroll.class, "setScrollNone"),
    LIGHTING_SCROLL_ON(DBusLightingScroll.class, "setScrollOn"),
    LIGHTING_SCROLL_PULSATE(DBusLightingScroll.class, "setScrollPulsate"),
    LIGHTING_SCROLL_REACTIVE(DBusLightingScroll.class, "setScrollReactive"),
    LIGHTING_SCROLL_SPECTRUM(DBusLightingScroll.class, "setScrollSpectrum"),
    LIGHTING_SCROLL_STATIC(DBusLightingScroll.class, "setScrollStatic"),
    LIGHTING_SCROLL_WAVE(DBusLightingScroll.class, "setScrollWave"),
    LIGHTING_SPECTRUM(DBusLightingChroma.class, "setSpectrum"),
    LIGHTING_STARLIGHT_DUAL(DBusLightingChroma.class, "setStarlightDual"),
    LIGHTING_STARLIGHT_RANDOM(DBusLightingChroma.class, "setStarlightRandom"),
    LIGHTING_STARLIGHT_SINGLE(DBusLightingChroma.class, "setStarlightSingle"),
    LIGHTING_STATIC(DBusLightingChroma.class, "setStatic"),
    LIGHTING_WAVE(DBusLightingChroma.class, "setWave"),
    MACRO_LOGIC(DBusDeviceMacro.class),
    MACRO_MODE_LED(DBusLedMacromode.class, "setMacromode"),
    MACRO_MODE_LED_EFFECT(DBusLedMacromode.class, "setMacroEffect"),
    MACRO_MODE_MODIFIER(DBusDeviceMacro.class, "setModeModifier"),
    NAME(true),
    POLL_RATE(DBusDeviceMisc.class, "getPollRate", "setPollRate"),
    REACTIVE_TRIGGER(DBusDeviceMisc.class, "triggerReactive"),
    SCROLL_ACCELERATION(DBusDeviceScroll.class, "getScrollAcceleration", "setScrollAcceleration"),
    SCROLL_MODE(DBusDeviceScroll.class, "getScrollMode", "setScrollMode"),
    SCROLL_SMART_REEL(DBusDeviceScroll.class, "getScrollSmartReel", "setScrollSmartReel"),
    SERIAL(true),
    SET_IDLE_TIME(DBusDevicePower.class, "setIdleTime"),
    SET_LOW_BATTERY_THRESHOLD(DBusDevicePower.class, "setLowBatteryThreshold"),
    SUPPORTED_POLL_RATES(DBusDeviceMisc.class, "getSupportedPollRates"),
    TYPE(true);

    @Nullable Class<? extends DBusInterface> dBusInterface;
    String @Nullable [] methods;
    @Nullable Boolean value;
    boolean hasCapability;

    Capability(@NotNull Class<? extends DBusInterface> dBusInterface) {
        this.dBusInterface = dBusInterface;
    }

    Capability(@NotNull Class<? extends DBusInterface> dBusInterface, String @NotNull ... methods) {
        this.dBusInterface = dBusInterface;
        this.methods = methods;
    }

    Capability(@NotNull Class<? extends DBusInterface> dBusInterface, @NotNull String method, boolean value) {
        this.dBusInterface = dBusInterface;
        this.methods = new String[]{method};
        this.value = value;
    }

    Capability(boolean hasCapability) {
        this.hasCapability = hasCapability;
    }
}