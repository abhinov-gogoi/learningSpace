package com.revise.OOPS;

public class B extends A {
    static String stat_name = "name is b";
    String name = "name is b";

    B() {
        super(1);
    }

    B(int a) {
       // System.out.println("hello");
        this();
    }

    public void dothis() {
        System.out.println(this.name);
    }
}
