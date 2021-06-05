package com.bridgelabz.linkedlist;

public class MySortedLinkedList<T extends Comparable<T>> {
    public MyNode<T> head = null;

    public void add(T data) {
        MyNode<T> myNode = new MyNode<>(data);
        MyNode<T> temp;
        if (head == null || head.data.compareTo(myNode.data) > 0) {
            myNode.next = head;
            head = myNode;
        } else {
            temp = head;
            while (temp.next != null && temp.next.data.compareTo(data) < 0)
                temp = temp.next;
            myNode.next = temp.next;
            temp.next = myNode;
        }
    }

    public void print() {
        MyNode<T> tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
    }
}
