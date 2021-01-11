package com.prepbytes.week7.linkedlist.singlylinkedlist;

class Node {
    int data;
    Node next;

    // constructor
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head = null;

    public void insertAtBeginning(int data){
        Node aNewNode = new Node(data);
        aNewNode.next = head;
        head = aNewNode;
    }

    public void insertAtEnd(int data){
        Node aNewNode = new Node(data);
        if(head == null)
            head = aNewNode;
        else {
            Node lastNode = head;
            while (lastNode.next != null)
                lastNode = lastNode.next; // make lastNode point to last Node
            lastNode.next = aNewNode;
        }
    }

    public void insertAfter(int num, int data){
        Node tempNode = head;
        while( tempNode != null && tempNode.data != num)
            tempNode = tempNode.next;

        Node newNode = new Node(data);
        newNode.next = tempNode.next;
        tempNode.next = newNode;
    }

    public void delete(int num){
        Node currentNode = head; // tempNode
        Node prevNode = null;

        while ( currentNode != null && currentNode.data != num) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode == head){
            if (head == null){
                System.out.println("List is Empty");
            }
            else
                head = head.next;
        }
        else
            prevNode.next = currentNode.next;
    }

    public void printList(){
        Node tempNode = head;
        while(tempNode != null){
            System.out.print(tempNode.data + ", ");
            tempNode = tempNode.next;
        }
        System.out.println("");
    }
}
