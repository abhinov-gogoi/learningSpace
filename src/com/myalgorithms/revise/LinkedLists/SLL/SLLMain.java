package com.myalgorithms.revise.LinkedLists.SLL;

public class SLLMain {
    public static void main(String[] args) {
        var list = new SInglyLinkedList();

        list.insertAtBeg(3);
        list.insertAtBeg(4);
        list.insertAtBeg(5);
        list.insertAtBeg(12);
        list.insertAfter(7, 4);
        list.insertAtEnd(100);

        list.print();
        System.out.println(list.contains(100));

    }
}
