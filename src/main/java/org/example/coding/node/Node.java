package org.example.coding.node;

public class Node<T> {
    public T data;
    public Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public Node() {
    }
}
