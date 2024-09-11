package com.daniela;

public class Stack {
    Node top;

    // Method to add a new node at the top
    public void push(int data) {
        Node newNode = new Node(data);
        if (top != null) {
            newNode.previus = top;
        }
        top = newNode;
    }

    // Method to print the stack
    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " <- ");
            current = current.previus;
        }
        System.out.print("null");
    }

    // Method to remove the top element
    public void pop() {
        if(top != null) {
            top = top.previus;
        }
    }

    // Method to remove the all elements
    public void popAll() {
        top = null;
    }

    // Method to get the n element, at i index
    public int get(int i) {
        Node current = top;
        while (i != 0) {
            current = current.previus;
            i --;
        }
        return current.data;
    }

    // Method to update the n element, at i index
    public void set(int newData, int i) {
        Node current = top;
        while (i != 0) {
            current = current.previus;
            i --;
        }
        current.data = newData;
    }
}
