package com.daniela;

public class Node {
    int data;         // Or any data type
    Node previus;        // Reference to the previus node

    Node(int data) {
        this.data = data;
        this.previus = null;
    }
}
