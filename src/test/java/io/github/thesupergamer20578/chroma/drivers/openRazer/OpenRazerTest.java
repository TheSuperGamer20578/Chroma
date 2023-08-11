package io.github.thesupergamer20578.chroma.drivers.openRazer;

import io.github.thesupergamer20578.chroma.Colour;
import io.github.thesupergamer20578.chroma.WaveDirection;
import org.freedesktop.dbus.exceptions.DBusException;
import org.testng.annotations.*;

public class OpenRazerTest {
    private OpenRazer driver;

    @BeforeClass
    public void setUp() throws DBusException {
        driver = new OpenRazer();
    }

    @AfterMethod
    public void confirm() throws InterruptedException {
        Thread.sleep(5000);
    }

    @Test
    public void testClearKeyboardEffect() {
        driver.clearKeyboardEffect();
    }

    @Test
    public void testStaticKeyboardEffect() {
        driver.staticKeyboardEffect(new Colour(0xff0000));
    }

    @Test
    public void testCustomKeyboardEffect() {
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

    @Test
    public void testWaveKeyboardEffectLTR() {
        driver.waveKeyboardEffect(WaveDirection.LEFT_TO_RIGHT);
    }

    @Test
    public void testWaveKeyboardEffectRTL() {
        driver.waveKeyboardEffect(WaveDirection.RIGHT_TO_LEFT);
    }

    @AfterClass
    public void tearDown() {
        driver.shutdown();
    }
}