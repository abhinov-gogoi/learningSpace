package com.codewithmosh;

public class Playground {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        if (a==b)
            System.out.println("a==b");
        else
            System.out.println("a!=b");

        var abc = new String("hello");
        var xyz = new String("hello");
        if (abc==xyz)
            System.out.println("abc==xyz");
        else
            System.out.println("abc!=xyz");
        // equals method
        if (abc.equals(xyz))
            System.out.println("abc=xyz");

        // checking is equals method exist in integer class
        // No doesnot exist, equals method is only for objects
    }
}
