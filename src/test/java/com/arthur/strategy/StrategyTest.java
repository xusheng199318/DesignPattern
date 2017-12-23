package com.arthur.strategy;

import org.junit.Test;

/**
 * Created by Arthur on 2017/12/23.
 */
public class StrategyTest {

    @Test
    public void testStrategy() {
        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.setFlyBehavior(new FlyWithWings());
        redHeadDuck.setQuackBehavior(new Quack());

        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
    }
}
