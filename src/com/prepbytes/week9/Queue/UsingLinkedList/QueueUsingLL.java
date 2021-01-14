package com.prepbytes.week9.Queue.UsingLinkedList;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

public class QueueUsingLL {
    Node front = null; // remove element from front
    Node rear = null; // insert element to rear

    void enqueue(int data) {
        var newNode = new Node(data);
        if (rear == null) {
            // if empty LL
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = rear.next;
    }

    int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int data = front.data;
        front = front.next;
        if (front==null)
            rear = null;
        return data;
    }

    public void print(){
        Node tempNode = front;
        while(tempNode != null){
            System.out.print(tempNode.data + ", ");
            tempNode = tempNode.next;
        }
        System.out.println("");
    }
}


