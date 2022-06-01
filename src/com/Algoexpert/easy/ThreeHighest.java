package com.netcat.meow.Algoexpert.easy;

import java.util.Arrays;

public class ThreeHighest {

    public static void main(String[] args) {
        int[] array = {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
        System.out.println(Arrays.toString(findThreeLargestNumbers(array)));
    }

    public static int[] findThreeLargestNumbers(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        int thirdHighest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= highest) {
                thirdHighest = secondHighest;
                secondHighest = highest;
                highest = array[i];
            }

            else if (array[i] >= secondHighest) {
                thirdHighest = secondHighest;
                secondHighest = array[i];
            }

            else if (array[i] >= thirdHighest) {
                thirdHighest = array[i];
            }
        }

        int[] arr = new int[3];
        arr[0] = thirdHighest;
        arr[1] = secondHighest;
        arr[2] = highest;

        return arr;
    }
}
