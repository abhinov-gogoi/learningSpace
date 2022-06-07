package com.Algoexpert.medium;

import java.util.ArrayList;
import java.util.List;

public class MoveElementToEnd3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);


        System.out.println(moveElementToEnd(list, 1));
    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {

        /**
         * using two pointers
         */
        int left_pointer = 0;
        int right_pointer = array.size()-1;

        System.out.println(array);
        // [1, 1, 2, 2, 2, 3, 4, 2, 1]

        for(int i=0 ; i<=array.size()-1; i++) {
            if(right_pointer<0){
                break;
            }
            if(array.get(right_pointer).equals(toMove)){
                right_pointer--;
                i--;
                continue;
            }

            if(left_pointer>=right_pointer) {
                break;
            }

            if(array.get(left_pointer).equals(toMove)) {
                // swap
                array.set(i, array.get(right_pointer));
                array.set(right_pointer, toMove);
                right_pointer--;
            }
            left_pointer++;
        }
        return array;
    }
}
