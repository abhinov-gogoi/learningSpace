package com.Algoexpert.easy;

public class TwoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int[] res = new int[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    res = new int[2];
                    res[0] = array[i];
                    res[1] = array[j];
                    break;
                }
            }
        }
        return res;
    }
}
