package com.masterclass.section2_Recursion;

/**
 * Find factorial of a number using recursion
 */
public class FactorialOfANumber {

    public static void main(String[] args) {
        System.out.println(factorialOf(6));
    }

    public static long factorialOf(long n) {
        // unintentional case - the constraint
        if (n < 0) {
            return -1;
        }
        // base case - the stopping criterion
        if (n == 0) {
            return 1;
        }
        // recursive case - the flow
        return n * factorialOf(n-1);
    }
}
