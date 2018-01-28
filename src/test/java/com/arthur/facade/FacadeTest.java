package com.arthur.facade;

import org.junit.Test;

/**
 * Created by Arthur on 2018/1/28.
 */
public class FacadeTest {

    @Test
    public void testFacade() {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplifier(), new DvdPlayer(), new TheaterLights(), new Screen(), new PopcornPopper());
        homeTheaterFacade.watchMovie("hello");
        homeTheaterFacade.endMovie();
    }
}
