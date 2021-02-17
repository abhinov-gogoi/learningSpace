package com.codewithmosh.part3advanced.lambdas;

public interface Printer {
    void print(String message);
}

/**

 This interface is a functional interface
 because it has a single abstract method.
 Functional interfaces can always be represented by using a lambda
 eg. here,
 (String message) -> {
 System.out.println(message);
 }

 */
