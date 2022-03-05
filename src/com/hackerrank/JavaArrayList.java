package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int lines = sc.nextInt();
        // create 2D List
        List<List<Integer>> main_list = new ArrayList<>(lines);
        while (lines-->0) {
            int size = sc.nextInt();
            List<Integer> sub_list = new ArrayList<>(size);
            for (int i=0; i<size; i++) {
                sub_list.add(sc.nextInt());
            }
            System.out.println(sub_list);
        }

        int queries = sc.nextInt();
        while (queries-->0) {

        }

    }
}
