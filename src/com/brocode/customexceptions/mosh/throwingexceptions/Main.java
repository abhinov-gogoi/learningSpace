package com.brocode.customexceptions.mosh.throwingexceptions;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account();
        try {
            myAccount.deposit(-100);
        }
        catch (IllegalArgumentException iae) {
            System.out.println("Please Enter a positive amount");
        }
    }
}
