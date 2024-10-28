package org.example.coding.list;

import org.example.coding.node.Node;

public class LinkedList<T> {
    public Node<T> insertAtBegin(T data, Node<T> start) {
        Node<T> newNode = new Node<>(data);
        if (start == null) {
            return newNode;
        } else {
            newNode.next = start;
            start = newNode;
            return start;
        }
    }

    public void display(Node<T> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
