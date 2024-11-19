package com.ds.arrays;

public class FindMinValueInArray {

	public static void main(String[] args) {
		int[] array = { 3, 5, 13, 55, 4, 2, 1, 56 };

		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		System.out.println("The min value is "+min);
	}

}
