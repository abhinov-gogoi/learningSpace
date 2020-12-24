package com.prepbytes.Week2;

import java.util.Arrays;
import java.util.Scanner;

public class UniqColourShirt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // no of shirts
        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt(); // populate the array
        }

        int count = 0;
        for(int i=0; i<arr.length; i++){
            boolean i_IsAUniqueColour = true;
            for(int j=0; j<arr.length; j++){
                if (arr[i] == arr[j] && i!=j) {
                    i_IsAUniqueColour = false;
                    break;
                }
            }
            if(i_IsAUniqueColour)
                count++;
        }
        System.out.println(count);
    }
}
