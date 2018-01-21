package com.arthur.strategy;

/**
 * Created by Arthur on 2018/1/20.
 */
public class VolatileTest {

    public static class MyThread1 extends Thread {
        private volatile boolean stop = false;

        public void stopMe() {
            stop = true;
        }

        public void run() {
            int i = 0;
            while (!stop) {
                i++;
            }
            System.out.println("stop the thread");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread1 t = new MyThread1();
        t.start();
        Thread.sleep(1000);
        t.stopMe();
        Thread.sleep(1000);
    }
}
