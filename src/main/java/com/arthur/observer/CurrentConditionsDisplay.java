package com.arthur.observer;

/**
 * Created by Arthur on 2017/12/23.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println(temperature);
        System.out.println(humidity);
    }

    public CurrentConditionsDisplay(Subject subject) {
        subject.registerObserver(this);
    }
}
