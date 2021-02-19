package com.prepbytes.week8.StackArray;

public class StackUsingArray {
    int top = -1;
    int max = 1000;
    int[] stackArray = new int[max]; // size of stack

    boolean isFull(){
        if (top == max-1) {
            return true;
        }
        return false;
    }

    boolean push(int data){
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        stackArray[++top] = data;
        return true;
    }

    int pop() {
        if (top < 0){
            System.out.println("Stack is empty");
            return -1;
        }
        int data = stackArray[top];
        top--;
        return data;
    }
}
