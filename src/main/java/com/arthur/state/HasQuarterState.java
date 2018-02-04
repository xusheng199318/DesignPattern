package com.arthur.state;

/**
 * Created by Arthur on 2018/2/4.
 */
public class HasQuarterState implements State {
    GumballMachine machine;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    public void insertQuarter() {
        System.out.println("you can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        machine.setState(machine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("You turned..");
        machine.setState(machine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
