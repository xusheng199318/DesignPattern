package com.arthur.decorator;

/**
 * Created by Arthur on 2017/12/24.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    public double cost() {
        return beverage.cost() + 0.9;
    }
}
