package com.arthur.decorator;

/**
 * Created by Arthur on 2017/12/24.
 */
public class Espresso extends Beverage {

    public String getDescription() {
        return "Espresso";
    }

    public double cost() {
        return 2.0;
    }
}
