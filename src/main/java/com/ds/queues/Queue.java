package com.ds.queues;

import java.util.NoSuchElementException;

public class Queue {

	private Node front;
	private Node rear;
	private int length;

	public class Node {
		private Node next;
		private int data;

		public Node(int data) {
			this.data = data;
		}

	}

	public void display() {
		Node current = front;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public void enQueue(int data) {
		Node node = new Node(data);
		if (isEmpty()) {
			front = node;
		} else {
			rear.next = node;
		}
		rear = node;
		length++;
	}

	public int deQueue() {
		if (isEmpty())
			throw new NoSuchElementException("No Data Available in Queue");

		int result = front.data;
		front = front.next;
		if (front == null)
			rear = null;

		length--;
		return result;
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(10);
		q.enQueue(15);
		q.enQueue(35);
		q.display();
		System.out.println("Value Removed from queue is -->"+q.deQueue());


	}

}
