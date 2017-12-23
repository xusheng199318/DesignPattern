package com.arthur.observer;

import org.junit.Test;

/**
 * Created by Arthur on 2017/12/23.
 */
public class ObserverTest {

    @Test
    public void testObserver() {
        WeatherData weatherData = new WeatherData();
        Observer currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(10, 11, 12);
    }
}
