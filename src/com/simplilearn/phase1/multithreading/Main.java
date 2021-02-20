package com.simplilearn.phase1.multithreading;

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.run();
        Runnable thread2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread2 is running");
            }
        };

        thread2.run();



    }
}
