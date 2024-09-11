package com.daniela;

public class Queue {
    Node front;

    // Method to add a new node at the end of the queue
    public void push(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
        } else {
            Node current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to print the stack
    public void printQueue() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " <- ");
            current = current.next;
        }
        System.out.print("null");
    }

    // Method to remove the first element
    public void pop() {
        if(front != null) {
            front = front.next;
        }
    }

    // Method to remove the all elements
    public void popAll() {
        front = null;
    }

    // Method to get the n element, at i index
    public int get(int i) {
        Node current = front;
        while (i != 0) {
            current = current.next;
            i --;
        }
        return current.data;
    }

    // Method to update the n element, at "i" index
    public void set(int newData, int i) {
        Node current = front;
        while (i != 0) {
            current = current.next;
            i --;
        }
        current.data = newData;
    }
}
