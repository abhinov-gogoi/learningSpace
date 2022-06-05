package com.Algoexpert.easy;

import java.util.Arrays;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String string = "ababac";
        System.out.println(firstNonRepeatingCharacter(string));
    }

    public static int firstNonRepeatingCharacter(String string) {
        // frequ array
        int[] freq_arr = new int[26];
        for(int i=0; i<string.length(); i++) {
            freq_arr[string.charAt(i)-97]++;
        }
        System.out.println(Arrays.toString(freq_arr));

        for(int i=0; i<string.length(); i++){
            if(freq_arr[string.charAt(i)-97]==1){
                return i;
            }
        }
        return -1;

    }
}
