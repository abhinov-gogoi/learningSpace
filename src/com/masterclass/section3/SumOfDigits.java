package com.masterclass.section3;

/**
 * Find the sum of the digits of a positive integer using recursion
 */
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(calculateSum(11234));
    }

    public static long calculateSum(long n) {
        if(n<0) {
            return -1;
        } else if(n==0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return n%10 + calculateSum(n/10);
    }
}
