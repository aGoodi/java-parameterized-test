package speedlights;

import main.SpeedLights;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class SpeedLightsTest {

    private final int currentSpeed;
    private final String light;


    public SpeedLightsTest(int currentSpeed, String light) {
        this.currentSpeed = currentSpeed;
        this.light = light;
    }


    @Parameters
    public static Object[][] setSpeedData() {
            return new Object[][] {
                    {59, "green"},
                    {61, "yellow"},
                    {79, "yellow"},
                    {81, "red"},
            };
    }

    @Test
    public void showLightWhenSpeed() {
        SpeedLights lights = new SpeedLights(60);
        String value = lights.showLight(currentSpeed);
        assertEquals(light, value);
    }
}