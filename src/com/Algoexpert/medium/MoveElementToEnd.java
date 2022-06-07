package com.Algoexpert.medium;

import java.util.ArrayList;
import java.util.List;

public class MoveElementToEnd {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);

        System.out.println(moveElementToEnd(list, 2));
    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {

        /**
         * using bubble sort
         */

        for(int i =0 ; i<array.size()-1; i++) {
            for(int j=i+1; j<array.size(); j++) {
                if(array.get(i)==toMove) {
                    // swap
                    int tmp = array.get(j);
                    array.set(j, array.get(i));
                    array.set(i, tmp);
                }
            }
        }
        return array;
    }
}
