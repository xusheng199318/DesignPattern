package com.arthur.afactory;

/**
 * Created by Arthur on 2018/1/1.
 */
public class NyPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new NyStyleCheesePizza();
        }
        return pizza;
    }
}
