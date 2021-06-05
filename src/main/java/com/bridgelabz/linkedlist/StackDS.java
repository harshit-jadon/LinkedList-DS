package com.bridgelabz.linkedlist;

public class StackDS<X>{
        MyLinkedList<X> myLinkedList = new MyLinkedList<>();
        public void push(X data)
        {
            myLinkedList.push(data);
        }
        public void pop() {
        myLinkedList.deleteFirstNode();
         }
        public MyNode<X> peak()
        {
            return myLinkedList.head;
        }
        public void printStack() {
        myLinkedList.printList();
         }
}
