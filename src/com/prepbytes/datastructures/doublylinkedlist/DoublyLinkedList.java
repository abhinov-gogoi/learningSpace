package com.prepbytes.datastructures.doublylinkedlist;

public class DoublyLinkedList {

    Node head = null;

    void insertAtBeg(int data){
        Node newNode = new Node(data);
        if (head==null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
    }

}

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
