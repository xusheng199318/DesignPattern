package com.arthur.facade;

/**
 * Created by Arthur on 2018/1/28.
 */
public class HomeTheaterFacade {
    private Amplifier amp;
    private DvdPlayer dvd;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.dvd = dvd;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie");
        popper.on();
        popper.pop();
        lights.dim();
        screen.down();
        amp.on();
        amp.setDvd(new DvdPlayer());
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        amp.off();
        dvd.off();
    }
}
