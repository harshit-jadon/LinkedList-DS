package com.bridgelabz.linkedlist;

public class MyNode <E> {
    E data;
    public MyNode<E> next;

    public MyNode(E data) {
        this.data = data;
        this.next = null;
    }
}

