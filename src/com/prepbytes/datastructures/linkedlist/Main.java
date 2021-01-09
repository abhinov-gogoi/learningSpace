package com.prepbytes.datastructures.linkedlist;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insertAtBeginning(1);
        list.insertAtEnd(10);
        list.insertAfter(1, 2);
        list.insertAfter(2, 3);
        list.printList();
        list.delete(1);
        list.printList();
    }
}
