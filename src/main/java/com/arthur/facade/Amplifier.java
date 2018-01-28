package com.arthur.facade;

/**
 * Created by Arthur on 2018/1/28.
 */
public class Amplifier {
    public void on() {
        System.out.println("Amplifier is on");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Set dvdPlayer");
    }

    public void setSurroundSound() {
        System.out.println("setSurroundSound");
    }

    public void setVolume(int volume) {
        System.out.println("volume is " + volume);
    }

    public void off() {
        System.out.println("Amplifier is off");
    }
}
