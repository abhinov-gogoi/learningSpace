package com.masterclass.section3;

/**
 * Find the greatest common divisor using recursion
 */
public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(550, 100));
        System.out.println(gcd(0, 0));
        System.out.println(gcd(1234, 1));
        System.out.println(gcd(60, 18));
        System.out.println(gcd(550, -10));
    }

    public static long gcd(long a, long b) {
        // unintentional case - the constraint
        if(a<0 || b<0) {
            return -1;
        }
        // base case - the stopping criterion
        if(b==0) {
            return a;
        }
        // recursive case - the flow
        return gcd(b, a%b);
    }
}
