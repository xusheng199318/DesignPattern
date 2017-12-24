package com.arthur.decorator;

import org.junit.Test;

/**
 * Created by Arthur on 2017/12/24.
 */
public class DecoratorTest {

    @Test
    public void testDecorator() {
        Beverage beverage = new Whip(new Mocha(new Espresso()));
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
