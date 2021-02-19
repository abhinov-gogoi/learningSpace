package com.prepbytes.week8.StackLinkedList;

public class StackLLMain {
    public static void main(String[] args) {
        StacksUsingLinkedList stackLL = new StacksUsingLinkedList();
        stackLL.push(1);
        stackLL.push(2);
        stackLL.push(23);

        int poppedElem = stackLL.pop();
        System.out.println("Element popped = "+poppedElem);
    }
}
