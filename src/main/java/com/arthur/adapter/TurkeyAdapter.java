package com.arthur.adapter;

/**
 * Created by Arthur on 2018/1/21.
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.quack();
    }

    public void fly() {
        turkey.fly();
    }
}
