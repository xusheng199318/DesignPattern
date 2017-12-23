package com.arthur.observer;

/**
 * Created by Arthur on 2017/12/23.
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
