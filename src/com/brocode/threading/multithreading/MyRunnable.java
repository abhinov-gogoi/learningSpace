package com.brocode.threading.multithreading;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i=10; i>=1; i--){
            System.out.println("----------  Thread #2 : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #2 is complete");
    }
}
