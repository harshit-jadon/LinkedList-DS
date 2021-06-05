package com.bridgelabz.linkedlist;

public class MyLinkedList <K> {
    public MyNode<K> head = null;
    public MyNode<K> tail = null;


    public void push(K data) {
        MyNode<K> myNode = new MyNode<>(data);
        if (tail == null) {
            this.tail = myNode;
        }
        if (head != null) {
             this.head = myNode.next ;
        }
        this.head = myNode;
    }
    public void append(K data){
        MyNode<K> myNode = new MyNode<>(data);
        if (head == null) {
            this.head = myNode;
        }
        if (tail != null) {
            tail.next = myNode;
        }
        this.tail = myNode;
    }
    public void insert(K data, K newData) {
        MyNode<K> myNode = new MyNode<>(newData);
        MyNode<K> temp = head;
        while (temp.data != data && temp.next != null) {
            temp = temp.next;
        }
        if(temp.next != null)
        {
            myNode.next = temp.next;
            temp.next = myNode;
        }
    }
        public void printList()  {
            MyNode<K> tempNode = head;
            while(tempNode!= null){
                System.out.println(tempNode.data);
            tempNode = tempNode.next;
            }
        }
}
