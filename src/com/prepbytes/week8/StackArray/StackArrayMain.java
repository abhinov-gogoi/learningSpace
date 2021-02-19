package com.prepbytes.week8.StackArray;

public class StackArrayMain {
    public static void main(String[] args) {
        var stackArray = new StackUsingArray();
        stackArray.push(50);
        stackArray.push(4);
        stackArray.push(60);
        stackArray.push(8);

        stackArray.pop();
        stackArray.pop();
        int data = stackArray.pop();
        System.out.println(data);
    }
}
