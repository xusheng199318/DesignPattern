package com.arthur.strategy;

/**
 * Created by Arthur on 2017/12/23.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("quack");
    }
}
