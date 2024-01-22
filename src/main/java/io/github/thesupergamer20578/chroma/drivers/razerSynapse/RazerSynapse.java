package io.github.thesupergamer20578.chroma.drivers.razerSynapse;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Guid;
import io.github.thesupergamer20578.chroma.*;
import io.github.thesupergamer20578.chroma.drivers.Driver;
import org.jetbrains.annotations.Nullable;

public class RazerSynapse implements Driver {
    private final RzChromaSDK SDK;

    private void handleResult(long code) {
        RzError result = RzError.valueOf(code);
        if (result != RzError.SUCCESS) {
            throw new RazerSynapseException(result, code);
        }
    }

    public RazerSynapse() {
        SDK = Native.load(System.getProperty("os.arch").contains("64") ? "RzChromaSDK64" : "RzChromaSDK", RzChromaSDK.class);
    }

    @Override
    public void init(ApplicationInfo applicationInfo) {
        init();
        handleResult(SDK.InitSDK(new AppInfoType(applicationInfo)));
    }

    @Override
    public void init() {
        handleResult(SDK.Init());
//        handleResult(SDK.CreateKeyboardEffect(EffectType.Keyboard.NONE.getValue(), Pointer.NULL, Pointer.NULL));
    }

    @Override
    public void shutdown() {
        handleResult(SDK.UnInit());
    }

    @Override
    public void clearKeyboardEffect() {
//        handleResult(SDK.CreateKeyboardEffect(EffectType.Keyboard.NONE.getValue(), Pointer.NULL, Pointer.NULL));
//        for (EffectType.Keyboard type : EffectType.Keyboard.values()) {
//            System.out.println("type = " + type);
//            try {
        ColourStruct colour = new ColourStruct(new Colour(0xffffff));
        colour.write();
        handleResult(SDK.CreateKeyboardEffect(EffectType.Keyboard.STATIC.getValue(), colour.getPointer(), Pointer.NULL));
//            } catch (RazerSynapseException e) {
//                e.printStackTrace();
//            }
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        handleResult(SDK.CreateKeyboardEffect(EffectType.Keyboard.SPECTRUM_CYCLING.getValue(), Pointer.NULL, Pointer.NULL));
    }

    @Override
    public void staticKeyboardEffect(Colour colour) {
//        handleResult(SDK.CreateKeyboardEffect(EffectType.Keyboard.STATIC.toNative(), new ColourStruct(new Colour(0xffffff)).getPointer(), Pointer.NULL));
        handleResult(SDK.CreateKeyboardEffect(6, 0xffffff, null));
    }

    @Override
    public void customKeyboardEffect(Colour[][] layout) {
        handleResult(SDK.CreateKeyboardEffect(EffectType.Keyboard.CUSTOM.toNative(), new CustomEffectStruct(layout).getPointer(), Pointer.NULL));
    }

    @Override
    public void waveKeyboardEffect(WaveDirection direction) {

    }

    @Override
    public void clearMouseEffect() {

    }

    @Override
    public void staticMouseEffect(Colour colour) {

    }

    @Override
    public void customMouseEffect(Colour[][] layout) {

    }

    @Override
    public void clearHeadsetEffect() {

    }

    @Override
    public void staticHeadsetEffect(Colour colour) {

    }

    @Override
    public void customHeadsetEffect(Colour[][] layout) {

    }

    @Override
    public void clearMousepadEffect() {

    }

    @Override
    public void staticMousepadEffect(Colour colour) {

    }

    @Override
    public void customMousepadEffect(Colour[][] layout) {

    }

    @Override
    public void clearKeypadEffect() {

    }

    @Override
    public void staticKeypadEffect(Colour colour) {

    }

    @Override
    public void customKeypadEffect(Colour[][] layout) {

    }

    @Override
    public void clearChromaLinkEffect() {

    }

    @Override
    public void staticChromaLinkEffect(Colour colour) {

    }

    @Override
    public void customChromaLinkEffect(Colour[][] layout) {

    }
}
