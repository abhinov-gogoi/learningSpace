package com.brocode.threading.multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // we can write a thread by creating a sub-class that extends Thread class
        MyThread T1 = new MyThread();

        // OR by creating a sub-class that implements Runnable interface
        // and pass instance as an argument to Thread()
        MyRunnable rn = new MyRunnable();
        Thread T2 = new Thread(rn);

        T1.start();
        Thread.sleep(500);
        T2.start();
    }
}
