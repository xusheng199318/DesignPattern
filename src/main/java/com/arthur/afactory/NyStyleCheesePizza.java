package com.arthur.afactory;

/**
 * Created by Arthur on 2018/1/1.
 */
public class NyStyleCheesePizza implements Pizza {
    public void prepare() {
        System.out.println("prepare NyStyleCheesePizza");
    }

    public void bake() {
        System.out.println("bake NyStyleCheesePizza");
    }

    public void cut() {
        System.out.println("cut NyStyleCheesePizza");
    }

    public void box() {
        System.out.println("box NyStyleCheesePizza");
    }
}
