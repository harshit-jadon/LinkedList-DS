package com.bridgelabz.testlinkedlist;

import com.bridgelabz.linkedlist.MyLinkedList;
import com.bridgelabz.linkedlist.MyNode;
import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
    @Test
    public void given3Numbers_WhenCreateToLinkedList_ShouldPassTest() {
        MyNode<Integer> myFirstnode = new MyNode<>(56);
        MyNode<Integer> mySecondnode = new MyNode<>(30);
        MyNode<Integer> myThirdnode = new MyNode<>(70);
//        myFirstnode.setNext(mySecondnode);
//        mySecondnode.setNext(myThirdnode);
        boolean result = myFirstnode.equals(mySecondnode) && mySecondnode.equals(myThirdnode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3Numbers_whenAddedToLinkedList_ShouldPassTest() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.push(70);
        myLinkedList.push(30);
        myLinkedList.push(56);
        myLinkedList.printList();
        boolean result = myLinkedList.head.equals(70) && myLinkedList.head.next.equals(30) && myLinkedList.head.next.equals(56);
    }
}
