package com.masterclass.section3;

/**
 * Find the power of a number using recursion
 * x4 = x1 * x3 = x(1+3) = x * x3
 * f(n) = n * f(n-1)
 */
public class PowerOfNum {
    public static void main(String[] args) {
        System.out.println(power(2, 4));
        System.out.println(power(2, 0));
        System.out.println(power(0, 0));
        System.out.println(power(0, 10));
        System.out.println(power(0, -5));
    }

    public static long power(long base, long exponent) {
        if (exponent<0) {
            return -1;
        } else if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent-1);
    }
}
