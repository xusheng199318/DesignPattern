package com.arthur.factory;

/**
 * Created by Arthur on 2018/1/1.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        return createPizza(type);
    }

    abstract Pizza createPizza(String type);
}
