package com.revise.collections;

import java.util.LinkedList;
import java.util.Queue;

// FIFO
public class LearnLinkedListQueue {
    /**
     * offer() vs peek() - inserts element into the queue. offer() returns true/false but add() throws exception if it fails
     * peek() vs element() - returns head of the queue, if empty peek() returns null but element() throws exception
     * poll() vs remove() - returns and removes head of the queue - if empty remove() throws exception while poll() returns null
     */

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.add(50); // in queue add (throws exception if it fails) but offer does not
        queue.offer(60);
        queue.offer(70);


        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println("Polled :: "+queue.poll());


    }


}
