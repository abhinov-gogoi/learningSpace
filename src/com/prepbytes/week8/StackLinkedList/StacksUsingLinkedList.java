package com.prepbytes.week8.StackLinkedList;

public class StacksUsingLinkedList {
    Node head = null;
    void push(int data){
        var aNewNode = new Node(data);
        if(head==null)
            head = aNewNode;
        aNewNode.next = head;
        head = aNewNode;
    }

    int pop(){
        if (head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int data = head.data;
        head = head.next;
        return data;
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

