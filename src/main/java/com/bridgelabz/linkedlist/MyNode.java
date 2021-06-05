package com.bridgelabz.linkedlist;

public class MyNode <E>{
    E data;
    private MyNode<E> next;

    public MyNode(E data){
       this.data = data;
       this.next = null;
   }

    public MyNode<E> getNext() {
        return next;
    }
    public void setNext(MyNode<E> next) {
        this.next = next;
    }
}
