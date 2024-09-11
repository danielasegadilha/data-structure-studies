package com.daniela;

public class SinglyLinkedList {
    Node head;

    // Method to add a new node at the beginning
    public void add(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    // Method to add a new node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }

    // Method to remove the first element
    public void remove() {
        if(head != null) {
            head = head.next;
        }
    }

    // Method to remove the last element
    public void removeLast() {

        if (head == null) {
            return; // List is already empty, nothing to remove
        }

        // Check if the list has only one element
        if (head.next == null) {
            head = null; // Remove the single element
            return;
        }

        Node current = head;
        while ((current.next).next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Method to remove the all elements
    public void removeAll() {
        head = null;
    }

    // Method to get the n element, at i index
    public int get(int i) {
        Node current = head;
        while (i != 0) {
            current = current.next;
            i --;
        }
        System.out.println(current.data);
        return current.data;
    }

    // Method to update the n element, at i index
    public void set(int newData, int i) {
        Node current = head;
        while (i != 0) {
            current = current.next;
            i --;
        }
        current.data = newData;
    }
}
