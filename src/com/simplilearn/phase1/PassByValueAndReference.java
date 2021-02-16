package com.simplilearn.phase1;

public class PassByValueAndReference {
    public static void main(String[] args) {

        double time = System.currentTimeMillis();
        System.out.println(time);
        System.out.println(time);
        System.out.println(time);
        System.out.println("--------------");
        System.out.println(System.currentTimeMillis());
    }
}
