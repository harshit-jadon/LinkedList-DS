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
        myLinkedList.push(30);
        myLinkedList.push(56);
        myLinkedList.push(70);
        myLinkedList.printList();
        boolean result = myLinkedList.head.data.equals(56) && myLinkedList.head.next.data.equals(30) && myLinkedList.tail.data.equals(70);
        Assert.assertTrue(result);
    }
    @Test
    public void given3Numbers_whenAppendToLinkedList_ShouldPassTest() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.push(30);
        myLinkedList.push(56);
        myLinkedList.push(70);
        myLinkedList.printList();
        boolean result = myLinkedList.head.data.equals(56) && myLinkedList.head.next.data.equals(30) && myLinkedList.tail.data.equals(70);
        Assert.assertTrue(result);
    }
    @Test
    public void given2NumberS_WhenInsertAfterFirstNumber_ShouldPassTest()
    {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(56);
        myLinkedList.append(70);
        myLinkedList.printList();
        myLinkedList.insert(56,30);
        boolean result = myLinkedList.head.data.equals(56) && myLinkedList.head.next.data.equals(30) && myLinkedList.head.next.data.equals(40) && myLinkedList.tail.data.equals(76);
        Assert.assertTrue(result);
    }

    @Test
    public void WhenDeleteFirstNode_FromLinkedList_ShouldReturnTrue() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(30);
        myLinkedList.append(56);
        myLinkedList.append(70);
        myLinkedList.printList();
        myLinkedList.deleteFirstNode();
        myLinkedList.printList();
        boolean result = myLinkedList.head.data.equals(56) && myLinkedList.head.next.data.equals(70);
        Assert.assertTrue(result);
    }

    @Test
    public void WhenDeleteLastNode_FromLinkedList_ShouldReturnTrue() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(30);
        myLinkedList.append(56);
        myLinkedList.append(70);
        myLinkedList.printList();
        myLinkedList.deleteLastNode();
        myLinkedList.printList();
        boolean result = myLinkedList.head.data.equals(30) && myLinkedList.head.next.data.equals(56);
    }
    @Test
    public void WhenSearchNode_FromLinkedList_ShouldReturnTrue() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(30);
        myLinkedList.append(56);
        myLinkedList.append(70);
        myLinkedList.printList();
        boolean result = myLinkedList.searchNode(30);
        Assert.assertTrue(result);
    }
}
