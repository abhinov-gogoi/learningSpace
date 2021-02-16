package com.simplilearn.phase1.staticmembers;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello myWorld");
        System.out.println();
        System.out.println("Hi");

        boolean isLooping = true;
        int i=0;

        for (; isLooping; ){
            System.out.println(i);
            if (i==10)
                isLooping=false;
            i++;
        }



    }
}
