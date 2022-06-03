package com.in28minutes.hibernate.collections;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        list.remove(1); // this will remove the element at this index
        list.remove(Integer.valueOf(70)); // this will remove the element 70
        list.set(2, 3000); // update index value
        System.out.println(list);


    }
}
