package com.arthur.decorator;

/**
 * Created by Arthur on 2017/12/24.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    public double cost() {
        return beverage.cost() + 1.0;
    }
}
