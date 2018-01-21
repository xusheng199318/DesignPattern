package com.arthur.adapter;

/**
 * Created by Arthur on 2018/1/21.
 */
public class WildTurkey implements Turkey {
    public void quack() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("i am flying a short distance");
    }
}
