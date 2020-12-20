package com.prepbytes.Week1;

import java.util.*;

public class Remainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to be divided by 10");
        int a;
        a = scanner.nextInt();

        System.out.println("com.prepbytes.Week1.Remainder is " + (a % 10));
    }
}
