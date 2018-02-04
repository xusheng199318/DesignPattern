package com.arthur.state;

/**
 * Created by Arthur on 2018/2/4.
 */
public class NoQuarterState implements State {
    GumballMachine machine;

    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    public void insertQuarter() {
        System.out.println("you inserted a quarter");
        this.machine.setState(machine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("you haven't insert a quarter");
    }

    public void turnCrank() {
        System.out.println("you turned but there is no quarter");
    }

    public void dispense() {
        System.out.println("you need to pay first");
    }
}
