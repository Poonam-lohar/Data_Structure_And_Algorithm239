package com.bridgelabz;

public class LinkedList<E>{


    Node<E> head;
    Node<E> tail;
    E empty;

    public void append(E key) {
        Node<E> newNode = new Node(key);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }


    public E findNode(E value) {
        if (head == null)
            return null;
        Node<E> temp = head;
        while (temp != null) {
            if (temp.key == value)
                return value;
            temp = temp.next;
        }

        return empty;
    }

    public void delete(E data) {
        if (head == null) {
            System.out.println("Empty linked list....");
            return;
        }
        Node<E> node = head;
        while (node != null) {
            if (node.key == data) {
                node.next = node.next.next;
                System.out.println("Deleted Element: " + data);
                return;
            }
            node = node.next;
        }
        System.out.println("Not found");
    }

    public int size() {
        int count = 0;
        Node<E> node = head;
        while (node != null) {
            node = node.next;
            count++;
        }
        return count;
    }

    public void display() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.key + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
