package com.bridgelabz.testlinkedlist;

import com.bridgelabz.linkedlist.MyLinkedList;
import com.bridgelabz.linkedlist.MyNode;
import com.bridgelabz.linkedlist.MySortedLinkedList;
import com.bridgelabz.linkedlist.StackDS;
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
        myLinkedList.append(30);
        myLinkedList.append(56);
        myLinkedList.append(70);
        myLinkedList.printList();
        myLinkedList.insert(30,40);
        boolean result = myLinkedList.head.data.equals(30) && myLinkedList.head.next.data.equals(40) && myLinkedList.head.next.next.data.equals(56) && myLinkedList.head.next.next.next.data.equals(70);
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

    @Test
    public void WhenDeleteNode_fromLinkedLit_ShouldReturnTrue(){
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(30);
        myLinkedList.append(56);
        myLinkedList.append(70);
        myLinkedList.printList();
    myLinkedList.deleteFromLinkedList(56);
    boolean result = myLinkedList.head.data.equals(30) && myLinkedList.head.next.data.equals(70);
    Assert.assertTrue(result);
    }

    @Test
    public void givenNumbers_whenCreateSortedList_ShouldReturnTrue(){
        MySortedLinkedList<Integer> mySortedLinkedList = new MySortedLinkedList<>();
        mySortedLinkedList.add(40);
        mySortedLinkedList.add(30);
        mySortedLinkedList.add(70);
        mySortedLinkedList.add(56);

        boolean result = mySortedLinkedList.head.data.equals(30) && mySortedLinkedList.head.next.data.equals(40) && mySortedLinkedList.head.next.next.data.equals(56) && mySortedLinkedList.head.next.next.next.data.equals(70);
        Assert.assertTrue(result);
    }
    @Test
    public void given3Integers_WhenAddedToStack_ShouldReturnTrue()
    {
        StackDS<Integer> stack = new StackDS<>();
        stack.push(56);
        stack.push(30);
        stack.push(70);
        MyNode result = stack.peak();
        Assert.assertEquals(result.data,70 );
    }
    @Test
    public void given3IntegersInStack_WhenPop_ShouldMatchWithSecondLastAddedNode() {
        StackDS<Integer> stack = new StackDS<>();
        stack.push(56);
        stack.push(30);
        stack.push(70);
        stack.printStack();
        stack.pop();
        stack.printStack();
        MyNode result = stack.peak();
        Assert.assertEquals(result.data ,70);
    }

}
