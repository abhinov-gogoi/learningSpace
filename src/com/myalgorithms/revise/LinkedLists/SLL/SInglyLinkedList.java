package com.myalgorithms.revise.LinkedLists.SLL;

public class SInglyLinkedList {
    SLLNode head;

    public void insertAtBeg(int data) {
        if (head==null)
            head = new SLLNode(data);
        else {
            var newNode = new SLLNode(data);
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAfter(int data, int after) {
        if (head==null)
            System.out.println("List is Empty");
        else {
            var newNode = new SLLNode(data);

            SLLNode temp = head;
            while (temp.data != after){
                temp = temp.next;
                if (temp.next==null)
                    System.out.println("Number "+after+" does not exist");
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void insertAtEnd(int data) {
        if (head==null)
            System.out.println("List is Empty");
        else {
            var newNode = new SLLNode(data);

            SLLNode temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            newNode.next = null;
            temp.next = newNode;
        }
    }

    public void delete(int data) {

    }

    public void print() {
        if (head==null)
            System.out.println("List is Empty");
        else {
            SLLNode temp = head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public boolean contains(int data) {
        SLLNode temp = head;
        while (temp != null){
            if (temp.data == data)
                return true;
            temp = temp.next;
        }
        return false;
    }

//    public void print() {
//        SLLNode temp;
//        temp = head;
//        if (temp == null)
//            System.out.println("List is Empty");
//        else {
//            while (true){
//                System.out.print(temp.data+" ");
//                if (temp.next != null){
//                    temp = temp.next;
//                }
//                else break;
//            }
//        }
//    }
}


