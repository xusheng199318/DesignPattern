package com.arthur.observer;

/**
 * Created by Arthur on 2017/12/23.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
