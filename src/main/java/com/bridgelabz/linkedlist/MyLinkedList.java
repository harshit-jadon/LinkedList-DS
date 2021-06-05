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
            myNode.next = this.head;
        }
        this.head = myNode;
    }

        public void printList()  {
            MyNode<K> tempNode = head;
            while(tempNode!= null){
                System.out.println(tempNode.data);
            tempNode = tempNode.next;
            }
        }
}
