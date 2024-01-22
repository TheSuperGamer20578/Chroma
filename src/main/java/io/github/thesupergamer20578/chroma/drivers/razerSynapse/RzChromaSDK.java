package io.github.thesupergamer20578.chroma.drivers.razerSynapse;

import com.sun.jna.Library;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.Guid;
import com.sun.jna.platform.win32.WinDef;

interface RzChromaSDK extends Library {
    long Init();

    long InitSDK(AppInfoType pAppInfo);

    long UnInit();

    long CreateEffect(Guid.GUID DeviceId, CEnum.Native<EffectType> Effect, Pointer pParam, Pointer pEffectId);

//    long CreateKeyboardEffect(CEnum.Native<EffectType.Keyboard> Effect, Pointer pParam, Pointer pEffectId);
    long CreateKeyboardEffect(Object Effect, Object pParam, Object pEffectId);
//    long CreateKeyboardEffect(int Effect, Pointer pParam, Pointer pEffectId);

    long CreateMouseEffect(CEnum.Native<EffectType.Mouse> Effect, Pointer pParam, Pointer pEffectId);

    long CreateHeadsetEffect(CEnum.Native<EffectType.Headset> Effect, Pointer pParam, Pointer pEffectId);

    long CreateMousepadEffect(CEnum.Native<EffectType.Mousepad> Effect, Pointer pParam, Pointer pEffectId);

    long CreateKeypadEffect(CEnum.Native<EffectType.Keypad> Effect, Pointer pParam, Pointer pEffectId);

    long CreateChromaLinkEffect(CEnum.Native<EffectType.ChromaLink> Effect, Pointer pParam, Pointer pEffectId);

    long DeleteEffect(Guid.GUID EffectId);

    long SetEffect(Guid.GUID EffectId);

    long RegisterEventNotification(WinDef.HWND hWnd);

    long UnregisterEventNotification();

//    long QueryDevice(Guid.GUID DeviceId, DEVICE_INFO_TYPE &DeviceInfo);
}
