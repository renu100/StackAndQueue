package com.LinkedLists;

public class Queue<K> {
	public final MyLinkedList<K> myLinkedList;

	public Queue() {
		myLinkedList = new MyLinkedList<>();

	}

	public void enqueue(INode<K> element) {
		myLinkedList.appendNode(element);
	}

	public INode<K> peak() {
		return myLinkedList.head;
	}

	public void printQueue() {
		myLinkedList.display();
	}

}
