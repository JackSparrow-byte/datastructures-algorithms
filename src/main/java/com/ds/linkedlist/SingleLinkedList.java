package com.ds.linkedlist;
/*Singly linked list is a data structure used for storing collection of nodes 
 * 1. it contains sequence of nodes;
 * 2. A node has data and reference to next node in a list
 * 3. First Node is head node.
 * 4. Last Node has Data and point to null
 * 
 * */

import com.ds.list.Node;

public class SingleLinkedList {

	private Node head;

	public int lengthOfLinkedList() {
		int count = 0;
		Node current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public void display() {
		Node current = head;

		while (current != null) {
			System.out.printf(current.data + "-----> ");
			current = current.next;
		}
		System.out.println("Completed Displying Data....!");

	}

	public void insertAtFirst(int value) {
		Node node = new Node(value);
		
		node.next = head;
		head = node;
	}

	public void insertAtLast(int value) {
		Node node = new Node(value);

		if (head == null) {
			head = node;
			return;
		}
		Node current = head;
		while (null != current.next) {
			current = current.next;
		}
		current.next = node;
	}

	public void insertAtParticularPosition(int data, int position) {
		Node node = new Node(data);
		if (position == 1) {
			node.next = head;
			head = node;
		} else {
			Node previous = head;

			int count = 1;

			while (count < position - 1) {
				previous = head.next;
				count++;
			}
			Node current = previous.next;
			node.next = current;
			previous.next = node;
		}
	}

	public Node deleteFirst() {
		if (head == null) {
			return null;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;

		return temp;
	}

	public Node deleteLast() {
		if (head == null || head.next == null) {
			return head;
		}
		Node current = head;
		Node previous = head;

		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}
	
	public boolean findElement(int searchValue) {
		Node current = head;
		while(current !=null) {
			if(current.data == searchValue) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public Node reverse() {
		if(head == null) {
			return head;
		}
		Node current = head;
		Node next = null;
		Node previous = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	public void deltaAtPosition(int position) {
		
		if(position == 1) {
			head = head.next;
		}else {
			Node previous = head;
			int count =1;
			while(count < position) {
				previous = previous.next;
				count++;
			}
			Node current = previous.next;
			previous.next = current.next;
			
		}
		
	}
	public Node findMiddleElement() {
		if(head == null) {
			return head;
		}
		Node slowPtr = head;
		Node fastptr = head;
		while(fastptr != null && fastptr.next!=null) {
			slowPtr = slowPtr.next;
			fastptr =  fastptr.next.next;
		}
		return slowPtr;
	}
	
	public Node findNthNode(int nthValue) {
		
		Node mainNode = head;
		Node refNode = head;
		int count = 0;
		while(count < nthValue) {
			refNode = refNode.next;
			count++;
		}
		
		while(refNode!=null) {
			refNode = refNode.next;
			mainNode = mainNode.next;
		}
		return mainNode;
	}
	
	public void insertNodeInSortedLL(Node newNode) {
		Node current = head;
		Node temp = null;
		
		while (current !=null && current.data < newNode.data) {
			temp = current;
			current = current.next;
		}
		newNode.next = current;
		temp.next = newNode;
		
	}
	
	public void removeByKey(int key) {
		Node current = head;
		Node temp = null;
		while(current!=null && current.data != key) {
			temp = current;
			current = current.next;
		}
		if(current == null) return;
		temp.next = current.next;
		
	}
	
	public boolean detectLoopInLL() {
		Node fastPtr = head;
		Node slowPtr = head;
		 while(fastPtr != null && fastPtr.next!=null) {
			 fastPtr =  fastPtr.next.next;
			 slowPtr = slowPtr.next;
			 
			 if(slowPtr == fastPtr) {
				 return true;
			 }
		 }
		 return false;
	}
	
	public Node startingPointForLoopInSLL() {
		Node fastPtr = head;
		Node slowPtr = head;
		 while(fastPtr != null && fastPtr.next!=null) {
			 fastPtr =  fastPtr.next.next;
			 slowPtr = slowPtr.next;
			 
			 if(slowPtr == fastPtr) {
				 return getStartingNode(slowPtr);
			 }
		 }
		 return null;
	}
	
	private Node getStartingNode(Node slowPtr) {
		Node temp = head;
		
		while(temp != slowPtr) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		
		return temp;
	}

	public void createLoop() {
		Node n1 = new Node(21);
		Node n2 = new Node(12);
		Node n3 = new Node(65);
		Node n4 = new Node(5);
		Node n5 = new Node(35);
		Node n6 = new Node(6);
		head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n3;


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
 

	public static void main(String[] args) {
		SingleLinkedList sl = new SingleLinkedList();
//		sl.head = new Node(41);
//		Node n1 = new Node(21);
//		Node n2 = new Node(12);
//		Node n3 = new Node(65);
//
//		sl.head.next = n1;
//		n1.next = n2;
//		n2.next = n3;
//
//		sl.display();
		
//		sl.createLoop();
//		
//		System.out.println(sl.detectLoopInLL());
//		System.out.println(sl.startingPointForLoopInSLL().data);
		
		
		sl.insertDataAtLast(4);
		sl.insertDataAtLast(11);
		sl.insertDataAtLast(9);
		sl.insertDataAtLast(2);
		sl.insertDataAtLast(9);
		sl.insertDataAtLast(1);

		sl.display();

		//sl.insertAtParticularPosition(50, 3);
		
		//sl.deleteLast();
		sl.deltaAtPosition(2);

		//System.out.println(sl.findElement(31));
		//System.out.println(sl.reverse());
//		System.out.println(sl.findMiddleElement());
		System.out.println(" Nth node is " +sl.findNthNode(3).data);
//		
//		sl.insertNodeInSortedLL(new Node(23));
		//sl.display();
//		sl.removeByKey(23);
//		
//		
		sl.display();
//		System.out.println("The count of SLL is  " + sl.lengthOfLinkedList());

	}

}
