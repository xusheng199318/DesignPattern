package com.arthur.afactory;

import org.junit.Test;

/**
 * Created by Arthur on 2018/1/1.
 */
public class AFactoryTest {

    @Test
    public void testAFactory() {
        PizzaStore nyPizzaStore = new NyPizzaStore();
        nyPizzaStore.orderPizza("cheese");
    }
}
