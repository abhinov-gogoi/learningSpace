package com.simplilearn.phase1.multithreading;

class Customer {
    int balance = 10_000;

    synchronized void withdraw(int amount) {
        System.out.println("Going to withdraw...");

        if (this.balance <amount)
            System.out.println("Less balance, waiting for deposit");
        try {
            wait();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        this.balance -= amount;
        System.out.println("Amount withdrawn. Amount left is "+ balance);
    }

    synchronized void deposit(int amount) {
        System.out.println("depositing amount ....");
        this.balance += amount;
        System.out.println("deposited "+ amount);
        notify();
    }
}

public class SimpleWaitNotify {
    public static void main(String[] args) {
        final Customer customer = new Customer();

        new Thread() {
            public void run() {
                customer.withdraw(12_000);
            }
        }.start();

        new Thread() {
            public void run() {
                customer.deposit(8_000);
            }
        }.start();
    }
}
