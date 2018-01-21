package com.arthur.adapter;

import org.junit.Test;

/**
 * Created by Arthur on 2018/1/21.
 */
public class AdapterTest {

    @Test
    public void testAdapter() {
        Duck duck = new MallardDuck();
        duck.quack();
        duck.fly();

        Turkey turkey = new WildTurkey();
        turkey.quack();
        turkey.fly();

        Duck adapterDuck = new TurkeyAdapter(new WildTurkey());
        adapterDuck.quack();
        adapterDuck.fly();
    }
}
