package com.myalgorithms.revise.LinkedLists.DLL;

import com.myalgorithms.revise.LinkedLists.SLL.SLLNode;

public class DoublyLinkedList {
    DLLNode head;
    DLLNode tail;

    public void insertAtBeg(int data) {
        var newNode = new DLLNode(data);
        if (head==null) {
            // if empty list
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
            newNode.next.prev = newNode;
        }
    }

    public void insertAfter(int data, int after) {

    }

    public void print() {
        if (head==null)
            System.out.println("List is Empty");
        else {
            DLLNode temp = head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
}
