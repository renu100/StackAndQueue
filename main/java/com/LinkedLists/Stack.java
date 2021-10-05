package com.LinkedLists;

public class Stack<K> {
	public final MyLinkedList<K> myLinkedList;

	public Stack() {
		myLinkedList = new MyLinkedList<>();
	}

	public void push(INode<K> element) {
		myLinkedList.addNode(element);
	}

	public INode<K> peak() {
		return myLinkedList.head;
	}

	public void printStack() {
		myLinkedList.display();
	}
}