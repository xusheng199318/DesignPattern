package com.arthur.strategy;

/**
 * Created by Arthur on 2018/1/20.
 */
public class MyThread extends Thread {

    private boolean stop = false;
    private int i = 0;

    @Override
    public void run() {
        while (!stop) {
            i++;
        }
        System.out.println("stop the thread");
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(2000);
        myThread.stop = true;
        System.out.println(myThread.i);
        Thread.sleep(2000);
        System.out.println(myThread.i);
    }
}
