package com.prepbytes.Week3;

public class FrequencyArray {
    public static void main(String[] args) {
        String str = "AAABBBBBBCCDDDDDDaaabbccdddeeee";
        int[] freq = new int[72];
        // loop through input string
        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i) - 65]++; // increment freq array's index of that particular char(i)

        // loop through freq array
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                char c = (char) (65 + i);
                System.out.print(c + "=" + freq[i] + "\n");
            }
        }
    }
}
