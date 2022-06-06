package com.revise.collections.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

//        Queue<Integer> pq = new PriorityQueue<>(); // implements mean heap internally
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // this implements max heap
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);


        System.out.println(pq.peek());

        System.out.println(pq);
    }
}
