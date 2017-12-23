package com.arthur.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Arthur on 2017/12/23.
 */
public class WeatherData implements Subject {
    private List<Observer> observers = new LinkedList<Observer>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
