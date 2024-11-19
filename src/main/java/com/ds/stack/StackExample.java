package com.ds.stack;

public class StackExample {

	private int[] arr;
	private int capacity;
	private int top;

	public StackExample(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	public int size() {
		return top + 1;
	}

	public int popElement() {
		if (isStackIsEmpty()) {
			System.out.println("Stack is empty add data to view ...");
		}
		return arr[top--];

	}

	private boolean isStackIsEmpty() {

		return top == -1;
	}

	public void pushElement(int value) {
		if (isStackIsFull()) {
			System.out.println("Stack Overflow Teriminating Application");
		}
		System.out.println("inserting value --->" + value);
		arr[++top] = value;
	}

	private boolean isStackIsFull() {
		return top == capacity - 1;
	}

	public int peekElement() {
		return top;
	}

	public void iterateAllValues() {
		if (isStackIsEmpty()) {
			throw new RuntimeException("No Data is available in stack to display");
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Value is ..." + arr[i]);
		}
	}

	public static void main(String[] args) {

		StackExample stack = new StackExample(5);
		stack.pushElement(1);
		stack.pushElement(5);
		stack.pushElement(4);
		stack.pushElement(9);
		stack.pushElement(0);

		System.out.println(stack.popElement());
		
		stack.iterateAllValues();

	}

}
