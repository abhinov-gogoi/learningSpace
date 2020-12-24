package com.prepbytes.week5;

import java.util.Scanner;

public class InterestingArrayTwo {

    // driver code
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // no of array elements
        int K = scan.nextInt(); // diff between the pairs
        int[] array = new int[N];
        for(int i=0; i<N; i++){
            array[i]=scan.nextInt(); // populate the array
        }

        int result = findNoOfPairs(array, K);
        System.out.println(result);
    }

    // function to find no of pairs in array
    public static int findNoOfPairs(int[] array, int diff){
        int count = 0;
        for(int i=0; i< array.length-1; i++){
            count += contains(array, i+1, array[i]+diff);
            count += contains(array, i+1, array[i]-diff);
        }
        return count;
    }

    // fn to find no of times an element occurs in array after a specific index.
    public static int contains(int[] array, int startingIndex, int numberToFind){
        int count = 0;
        for(int i=startingIndex; i<array.length; i++){
            if(array[i]==numberToFind)
                count++;
        }
        return count;
    }
}
