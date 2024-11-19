package com.ds.list;

public class SinglyLinkedList {
	private Node head;


	public void display() {
		Node current =  head;
		if(current ==  null) {
			System.out.println("No Data to display...!");
		}
		int i = 0;
		while(current != null) {
			System.out.println("Available Data at position "+i+" --> "+current.data);
			current = current.next;
			i++;
		}
	}
	

	public void insertData(final int data) {
		final Node node = new Node(data);
		if(head == null) {
			head = node;
			return;
		}
		Node current = head;
		while(current.next !=null) {
			current = current.next;
		}
		current.next = node;
		
	}
	
	public Node insertDataAtFirst(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			return node;
		}
		node.next =  head;	
		head = node;
		return head;
		
	}
	
	public void insertDataAtLast(final int data) {
		final Node node = new Node(data);
		if(head == null) {
			head = node;
			return;
		}
		Node current = head;
		while(current.next!=null) {
			current = current.next;
		}
		current.next = node;
	}
	
	public void insertDataAtParticularPosition(final int data,final int position) {
		final Node node = new Node(data);
		if(position == 1) {
			node.next = head;
			head = node;
		}else {
			Node previous = head;
			int count = 1;
			while(count < position -1) {
				previous = head.next;
				System.out.println(previous);
				count++;
			}
			
			final Node current = previous.next;
			node.next = current;
			previous.next = node;
			
		}
		
	}
	
	public void deleteFirst() {
		if(head == null) {
			return;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
	}
	
	public static void main(final String[] args) {
		final SinglyLinkedList ll = new SinglyLinkedList();
		ll.insertDataAtLast(4);
		ll.insertDataAtLast(2);
		ll.insertDataAtLast(6);
		ll.insertDataAtLast(8);
		
//		ll.insertDataAtParticularPosition(9, 4);
//		ll.deleteFirst();
		ll.display();
	}

}
