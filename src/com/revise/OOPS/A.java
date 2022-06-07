package com.revise.OOPS;

public class A {

    public String instance_variable = "Instance variables are declared in a class, but outside a method, constructor or any block.";
    public static String class_variable = "Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block.";

    A() {
        this(23);
    }

    A(int a) {
        System.out.println(a);
    }
}
