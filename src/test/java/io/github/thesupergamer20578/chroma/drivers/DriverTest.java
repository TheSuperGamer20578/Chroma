package io.github.thesupergamer20578.chroma.drivers;

import io.github.thesupergamer20578.chroma.*;
import org.freedesktop.dbus.exceptions.DBusException;
import org.testng.annotations.*;

public class DriverTest {
    private Driver driver;

    @BeforeClass
    public void setUp() throws DBusException {
        System.out.println("DriverTest.setUp");
        driver = Chroma.getDriver();
        assert driver != null;
        driver.init(new ApplicationInfo(
                "Chroma Test",
                "Unit tests for Chroma",
                "TheSuperGamer20578",
                "https://github.com/TheSuperGamer20578/Chroma",
                new DeviceType[]{DeviceType.KEYBOARD},
                Category.APPLICATION
        ));
    }

    @AfterMethod
    public void confirm() throws InterruptedException {
        System.out.println("DriverTest.confirm");
        Thread.sleep(5000);
    }

    @Test
    public void testClearKeyboardEffect() {
        System.out.println("DriverTest.testClearKeyboardEffect");
        driver.clearKeyboardEffect();
    }

    @Ignore
    @Test
    public void testStaticKeyboardEffect() {
        System.out.println("DriverTest.testStaticKeyboardEffect");
        driver.staticKeyboardEffect(new Colour(0xff0000));
    }

    @Ignore
    @Test
    public void testCustomKeyboardEffect() {
        System.out.println("DriverTest.testCustomKeyboardEffect");
        Colour c = new Colour(0x00ff00);
        Colour a = new Colour(0x0000ff);
        driver.customKeyboardEffect(new Colour[][]{
                {c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, a},
                {c, c, a, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c},
                {c, c, c, c, c, c, c, a, c, c, c, a, c, c, c, c, c, c, c, c, c, c},
                {c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c},
                {c, c, c, c, a, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c},
                {a, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c, c},
        });
    }

    @Ignore
    @Test
    public void testWaveKeyboardEffectLTR() {
        System.out.println("DriverTest.testWaveKeyboardEffectLTR");
        driver.waveKeyboardEffect(WaveDirection.LEFT_TO_RIGHT);
    }

    @Ignore
    @Test
    public void testWaveKeyboardEffectRTL() {
        System.out.println("DriverTest.testWaveKeyboardEffectRTL");
        driver.waveKeyboardEffect(WaveDirection.RIGHT_TO_LEFT);
    }

    @AfterClass
    public void tearDown() {
        System.out.println("DriverTest.tearDown");
        driver.shutdown();
    }
}
