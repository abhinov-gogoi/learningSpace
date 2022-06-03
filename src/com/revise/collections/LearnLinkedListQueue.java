package com.revise.collections;

import java.util.LinkedList;
import java.util.Queue;

// FIFO
public class LearnLinkedListQueue {



    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.add(50); // in queue add and offer are same
        queue.offer(60);
        queue.offer(70);

        System.out.println(queue);
        System.out.println(queue.peek());
    }


}
