package com.ds.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class MoveZerosToLast {
	
	
	public class MoveZerosToLastStreams{
		public void moveZeroToLast(int[] array) {
			Arrays.stream(array).boxed().sorted().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		}
	}

	public void moveZerosToLast(int[] array) {
		int j = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0 && array[j] == 0) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			if (array[j] != 0) {
				j++;
			}
		}
		System.out.println("After Moving Elements  "+Arrays.toString(array));
	}

	public static void main(String[] args) {
		int[] arr = { 24, 0, 13, 55, 0, 23, 57 };
		MoveZerosToLast zero = new MoveZerosToLast();
		zero.moveZerosToLast(arr);
		MoveZerosToLast.MoveZerosToLastStreams zeroStream = zero.new MoveZerosToLastStreams();
		zeroStream.moveZeroToLast(arr);
	}

}
