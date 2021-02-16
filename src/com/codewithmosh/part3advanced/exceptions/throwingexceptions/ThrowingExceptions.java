package com.codewithmosh.part3advanced.exceptions.throwingexceptions;

public class ThrowingExceptions {
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
