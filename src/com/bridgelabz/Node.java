package com.bridgelabz;

public class Node<E>{
    E key;
    Node<E> next;


    public Node(E key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", next=" + next +
                '}';
    }
}

