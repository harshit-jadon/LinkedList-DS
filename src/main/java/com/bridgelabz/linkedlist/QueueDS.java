package com.bridgelabz.linkedlist;

public class QueueDS<Y> {
    MyLinkedList<Y> myLinkedList = new MyLinkedList<>();

    public void enqueue(Y data) {
        myLinkedList.append(data);
    }

    public MyNode<Y> front()
    {
        return myLinkedList.head;
    }
    public void dequeue() {
        myLinkedList.deleteFirstNode();
    }

    public void printQueue() {
        myLinkedList.printList();
    }
}
