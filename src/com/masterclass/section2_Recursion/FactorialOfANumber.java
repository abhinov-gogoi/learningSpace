package com.masterclass.section2_Recursion;

/**
 * Find factorial of a number using recursion
 */
public class FactorialOfANumber {

    public static void main(String[] args) {
        System.out.println(factorialOf(6));
    }

    public static long factorialOf(long n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        }
        else return n * factorialOf(n-1);
    }
}
