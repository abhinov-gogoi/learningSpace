package com.revise.collections.list;

import java.util.Stack;

// LIFO
public class LearnStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.add(50); // in stack add and push are same
        stack.push(60);
        stack.push(70);

        System.out.println(stack.peek()); // shows element at top of the stack
        stack.pop(); // removes top elem
        System.out.println();
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
