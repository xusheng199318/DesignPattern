package com.arthur.state;

import org.junit.Test;

/**
 * Created by Arthur on 2018/2/4.
 */
public class StateTest {

    @Test
    public void testState() {
        GumballMachine gumballMachine = new GumballMachine(10);
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
    }
}
