package com.codewithmosh.part3advanced.exceptions.throwingexceptions;

public class Account {
    public void deposit(int amount) throws IllegalArgumentException {
        if (amount<0)
            throw new IllegalArgumentException();
    }
}
