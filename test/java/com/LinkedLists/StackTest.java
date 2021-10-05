package com.LinkedLists;

import org.junit.Assert;
import org.junit.Test;

class StackTest {

	@Test
	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
		Stack<Integer> stack = new Stack<>();
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		INode<Integer> myNode = stack.peak();
		stack.printStack();
		Assert.assertEquals(myThirdNode, myNode);
	}

	@Test
	public void given3NumbersInStackWhenPoppedShouldMatchWithLastAddedNode() {
		Stack<Integer> stack = new Stack<>();
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		INode<Integer> myNode = stack.pop();
		stack.printStack();
		Assert.assertEquals(myThirdNode, myNode);
	}

}
