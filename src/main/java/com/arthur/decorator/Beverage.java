package com.arthur.decorator;

/**
 * Created by Arthur on 2017/12/24.
 */
public abstract class Beverage {
    private String description = "Unkown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
