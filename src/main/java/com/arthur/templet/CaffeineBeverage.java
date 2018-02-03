package com.arthur.templet;

/**
 * Created by Arthur on 2018/1/31.
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
