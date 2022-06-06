package com.Algoexpert.medium;

import java.util.Arrays;

public class ArrayOfProducts {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arrayOfProducts(arr)));
    }

    public static int[] arrayOfProducts(int[] array) {
        int[] product_arr = new int[array.length];

        for(int i=0; i< array.length; i++) {
            product_arr[i] = calcProduct(array, i);
        }
        return product_arr;
    }

    private static int calcProduct(int[] array, int index) {
        int sumOfProduct = 1;
        for(int i=0; i<array.length; i++) {
            if(i==index) {
                continue;
            }
            sumOfProduct = sumOfProduct * array[i];
        }
        return sumOfProduct;
    }
}
