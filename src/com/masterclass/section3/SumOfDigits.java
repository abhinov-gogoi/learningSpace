package com.masterclass.section3;

/**
 * Find the sum of the digits of a positive integer using recursion
 */
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(calculateSum(11234));
    }

    public static long calculateSum(long n) {
        // unintentional case - the constraint
        if(n<0) {
            return -1;
        }
        if(n==0) {
            return 0;
        }
        // base case - the stopping criterion
        if (n == 1) {
            return 1;
        }
        // recursive case - the flow
        return n%10 + calculateSum(n/10);
    }
}
