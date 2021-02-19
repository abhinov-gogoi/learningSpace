package com.mosh.generics;

public class Main {
    public static void main(String[] args) {
        var list = new List(10);
        list.print();

        var genericList = new GenericList<Integer>();
        genericList.add(1);
        genericList.add(2);

    }

}
