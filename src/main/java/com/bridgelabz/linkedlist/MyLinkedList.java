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
    public void insert(K newdata, K data) {
        MyNode<K> myNode = new MyNode<>(data);
        MyNode<K> temp = head;
        while (temp.data != newdata && temp.next != null) {
            temp = temp.next;
        }
        if(temp.next != null)
        {
            myNode.next = temp.next;
            temp.next = myNode;
        }
    }
    public void deleteFirstNode(){
        if(head ==null){
            System.out.println("linkedList is already empty");}
        else{
            head = head.next;
        }
    }
    public void deleteLastNode() {
        if (tail == null)
            System.out.println("LinkedList is Already Empty");
        else {
            MyNode<K> temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
        }
    }
    public boolean searchNode(K data) {
        MyNode<K> temp = head;
        while(temp != null)
        {
            if(temp.data == data)
            {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

        public void printList()  {
            MyNode<K> tempNode = head;
            while(tempNode!= null){
                System.out.println(tempNode.data);
            tempNode = tempNode.next;
            }
        }
}
