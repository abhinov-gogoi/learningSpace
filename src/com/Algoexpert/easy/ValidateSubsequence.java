package com.netcat.meow.Algoexpert.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence = new ArrayList<>(Arrays.asList(1, 6, -1, 10, 11, 11, 11, 11));
        System.out.println(isValidSubsequence(array, sequence));
    }
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        if(sequence.size()> array.size()) {
            return false;
        }

        int searched_upto = -1;
        for (int i = 0; i < sequence.size(); i++) {
            for(int j=searched_upto+1; j< array.size(); j++) {
                searched_upto++;
                if(sequence.get(i).equals(array.get(j))) {
                    break;
                }

                // if end is reached for the array but sub seq end is not reached
                if(searched_upto==array.size() && i<=sequence.size()-1) {
                    return false;
                } else if(searched_upto==array.size() && !sequence.get(i).equals(array.get(j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
