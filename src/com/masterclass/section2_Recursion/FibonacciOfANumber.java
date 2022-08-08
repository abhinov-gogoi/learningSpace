package com.masterclass.section2_Recursion;

/**
 * Write a program to find the nth fibonacci number
 */
public class FibonacciOfANumber {

    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }

    public static long fibonacci(long n) {
        if(n<0){
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
