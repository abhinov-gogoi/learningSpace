package com.prepbytes.week5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Number of Chocolates
 */
public class NumberOfChocolates {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int size = sc.nextInt();
        int[] chocolate_arr = new int[size];
        // populate the array
        for(int i=0; i<size; i++) {
            chocolate_arr[i] = sc.nextInt();
        }
        // sort the array
        Arrays.sort(chocolate_arr);

        // for Q no of queries/ test cases
        int Q = sc.nextInt();
        while (Q-->0) {
            // amount -> amount X that I have
            int amount = sc.nextInt();

            // chocolates_i_can_buy -> no of chocolates I can buy from array with X amount of money
            int chocolates_i_can_buy = calculateNoOfChocolateIcanBuy(chocolate_arr, amount);
            System.out.println(chocolates_i_can_buy);
        }
    }

    private static int calculateNoOfChocolateIcanBuy(int[] chocolate_arr, int amount_i_have) {
        int chocolates_i_can_buy=0;
        for (int i=0; i<chocolate_arr.length; i++) {
            if(chocolate_arr[i]>amount_i_have) {
                return i;
            }
        }
        return chocolates_i_can_buy;
    }
}
