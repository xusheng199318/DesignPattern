package com.arthur.factory;

import org.junit.Test;

/**
 * Created by Arthur on 2018/1/1.
 */
public class FactoryTest {

    @Test
    public void testFactory() {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

}
