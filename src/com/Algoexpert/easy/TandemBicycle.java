package com.Algoexpert.easy;

import java.util.Arrays;

public class TandemBicycle {
    public static void main(String[] args) {
        int[] redShirtSpeeds = {5, 5, 3, 9, 2};
        int[] blueShirtSpeeds = {3, 6, 7, 2, 1};
        boolean fastest = false;
        System.out.println(tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest));
    }

    public static int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        // Write your code here.
        if (redShirtSpeeds.length == 0) {
            return 0;
        }

        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);
        System.out.println(Arrays.toString(redShirtSpeeds));
        System.out.println(Arrays.toString(blueShirtSpeeds));

        int count = 0;
        for (int i = 0; i < redShirtSpeeds.length; i++) {
            if (fastest) {
                count = count + Integer.max(redShirtSpeeds[i], blueShirtSpeeds[blueShirtSpeeds.length - 1 - i]);
            } else {
                count = count + Integer.max(redShirtSpeeds[i], blueShirtSpeeds[i]);
            }
        }
        return count;
    }
}
