package com.simplilearn.phase1;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // when we use String Buffer instead of Normal String we get some built in methods like

        sb.append("Hey. ");
        sb.reverse();
        System.out.println(sb);

    }
}
