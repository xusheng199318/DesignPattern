package com.arthur.singleton;

/**
 * Created by Arthur on 2018/1/16.
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton instance;

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
