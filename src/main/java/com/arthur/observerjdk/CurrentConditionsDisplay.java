package com.arthur.observerjdk;

import com.arthur.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Arthur on 2017/12/23.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            o.addObserver(this);
            display();
        }
    }

    public void display() {
        System.out.println(temperature);
        System.out.println(humidity);
    }
}
