package com.prepbytes.week9.Queue.UsingArray;
/*
    QUEUE follows FIFO concept
*/

public class QueueUsingArray {
    int size; // size of array
    int[] array;

    // constructor
    public QueueUsingArray(int size) {
        this.size = size;
        array = new int[this.size]; // create array to store values of queue
    }

    int front = -1; // pointer to delete element from array
    int rear = -1; // pointer to insert element into array

    void enqueue(int data) {
        rear = (rear+1)% size;
        if (front==rear) {
            System.out.println("Queue is full");
            return;
        }
        else {
            array[rear] = data;
            if (front==-1)
                front=0;
        }
    }

    // remove an element at front of queue and return the element
    int dequeue() {
        if (front==-1) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE; // or return -1
        }
        else {
            int temp = array[front];
            if (front==rear)
                front=rear=-1;
            front = (front+1)% size;
            return temp;
        }
    }

    void print() {
        if (front==rear)
            System.out.println("Queue is empty");
        else
            for (int i=front; i<=rear; i++){
                System.out.print(array[i]+", ");
            }
    }

}
