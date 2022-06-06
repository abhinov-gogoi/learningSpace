package com.revise.collections.queue;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {

        // Doubly ended queue
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(10);
        adq.offer(25);

        adq.offerFirst(20);
        adq.offerLast(50);

//        adq.pollFirst();
//        adq.pollLast();

        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq);

    }
}
