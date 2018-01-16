package com.arthur.factory;

import java.util.ArrayList;

/**
 * Created by Arthur on 2018/1/1.
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();


    void prepare() {
        System.out.println("prepare " + name);
        System.out.println("tossing dough... ");
        System.out.println("adding sauce...");
        System.out.println("adding toppings");
        for (String p : toppings) {
            System.out.println(p);
        }
    }

    void bake() {
        System.out.println("bake Pizza");
    }

    void cut() {
        System.out.println("cut Pizza");
    }

    void box() {
        System.out.println("box Pizza");
    }
}
