package com.arthur.singleton;

/**
 * Created by Arthur on 2018/1/16.
 */
public class StaticSingleton {
    private static StaticSingleton instance = new StaticSingleton();

    public static StaticSingleton getInstance() {
        return instance;
    }

    private StaticSingleton() {}
}
