package com.arthur.facade;

/**
 * Created by Arthur on 2018/1/28.
 */
public class DvdPlayer {

    public void on() {
        System.out.println("dvd is on");
    }

    public void play(String movie) {
        System.out.println("display :" + movie);
    }

    public void off() {
        System.out.println("dvd is off");
    }
}
