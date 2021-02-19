package com.prepbytes.week9.Queue.UsingLinkedList;

public class Main {
    public static void main(String[] args) {
        var queue = new QueueUsingLL();
        // FIFO
        queue.enqueue(1);
        queue.enqueue(62);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(2);
        queue.enqueue(8);
        queue.enqueue(12);

        queue.dequeue();

        queue.print();
    }
}
