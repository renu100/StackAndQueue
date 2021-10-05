package com.LinkedLists;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {
	@Test
	public void given3NumbersInQueueWhenAddedShouldPassQueueTest() {
		Queue<Integer> queue = new Queue<>();
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		queue.enqueue(myFirstNode);
		queue.enqueue(mySecondNode);
		queue.enqueue(myThirdNode);
		INode<Integer> myNode = queue.peak();
		queue.printQueue();
		Assert.assertEquals(myNode, myFirstNode);
	}

	@Test
	public void given3NumbersInStackWhenPoppedShouldMatchWithLastAddedNode() {
		Queue<Integer> queue = new Queue<>();
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		queue.enqueue(myFirstNode);
		queue.enqueue(mySecondNode);
		queue.enqueue(myThirdNode);
		INode<Integer> myNode = queue.dequeue();
		queue.printQueue();
		Assert.assertEquals(myNode, myThirdNode);
	}
}