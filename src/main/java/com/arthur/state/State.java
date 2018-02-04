package com.arthur.state;

/**
 * Created by Arthur on 2018/2/4.
 */
public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

}
