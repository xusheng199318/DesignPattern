package com.arthur.factory;

/**
 * Created by Arthur on 2018/1/8.
 */
public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new NYStyleCheesePizza();
        }

        return pizza;
    }
}
