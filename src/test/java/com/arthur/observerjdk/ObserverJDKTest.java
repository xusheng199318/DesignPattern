package com.arthur.observerjdk;

import org.junit.Test;

/**
 * Created by Arthur on 2017/12/23.
 */
public class ObserverJDKTest {

    @Test
    public void testObserverJDK() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        weatherData.setMeasurements(10, 11, 12);
        currentConditionsDisplay.update(weatherData, null);
    }
}
