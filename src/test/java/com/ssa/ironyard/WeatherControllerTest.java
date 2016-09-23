package com.ssa.ironyard;

import org.junit.Test;
import com.ssa.ironyard.services.WeatherService;

public class WeatherControllerTest {

    @Test
    public void test() {
        WeatherService ws = new WeatherService();
        System.err.println(ws.getWeather("MD", "Baltimore"));
}

}
