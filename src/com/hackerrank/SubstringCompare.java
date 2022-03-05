package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
 */
public class SubstringCompare {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        String input = sc.next();
        int k = sc.nextInt(); // length of substrings to find
        System.out.println("You have entered : "+input);
        System.out.println("-----------------------");

        String[] substring_array = new String[input.length()-k+1];
        for (int i=0; i<=input.length()-k; i++) {
            String substring = input.substring(i, i+k);
            substring_array[i] =substring;
        }
        System.out.println(Arrays.toString(substring_array));
        Arrays.sort(substring_array);
        System.out.println(Arrays.toString(substring_array));

        System.out.println(substring_array[0]);
        System.out.println(substring_array[substring_array.length-1]);

        System.out.println(getSmallestAndLargest(input, k));


    }

    public static String getSmallestAndLargest(String s, int k) {
        String[] substring_array = new String[s.length()-k+1];
        for (int i=0; i<=s.length()-k; i++) {
            String substring = s.substring(i, i+k);
            substring_array[i] =substring;
        }
//        Arrays.sort(substring_array);
        for (int i = 0; i < substring_array.length; i++) {
            for (int j = i + 1; j < substring_array.length; j++) {
                if (substring_array[i].compareToIgnoreCase(substring_array[j]) > 0) {
                    String temp = substring_array[i];
                    substring_array[i] = substring_array[j];
                    substring_array[j] = temp;
                }
            }
        }
        return substring_array[0] + "\n" + substring_array[substring_array.length-1];
    }


}
