package com.bridgelabz.testlinkedlist;

import com.bridgelabz.linkedlist.MyNode;
import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
    @Test
    public void given3Numbers_WhenCreateToLinkedList_ShouldPassTest() {
        MyNode<Integer> myFirstnode = new MyNode<>(56);
        MyNode<Integer> mySecondnode = new MyNode<>(30);
        MyNode<Integer> myThirdnode = new MyNode<>(76);
        myFirstnode.setNext(mySecondnode);
        mySecondnode.setNext(myThirdnode);
        boolean result = myFirstnode.getNext().equals(mySecondnode) && mySecondnode.getNext().equals(myThirdnode);
        Assert.assertTrue(result);

    }
}
