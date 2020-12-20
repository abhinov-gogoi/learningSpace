package com.prepbytes.Week1;

import java.util.*;

public class FavNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any digit number");
        int a;
        a = scanner.nextInt();
        int b = a;
        int count = 0;

            while(a!=0) {
                System.out.println("entering while loop " + count + " times");
                int rem = a % 10;
                a = a / 10;
                if (rem == 5){
                    count++;
            }
        }
            System.out.println("The number of times 5 occours in " + b + " is " + count);
    }
}

