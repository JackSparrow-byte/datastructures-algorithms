package com.ds.arrays;

public class FindMissingNumberInArray {

	public void findMissingNumber(int[] arr) {
		// * formula n * (n+1) / 2 gives sum of n numbers;
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;

		for (var num : arr) {
			sum = sum - num;
		}
		System.out.println("The Missing value is " + sum);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7};
		FindMissingNumberInArray missing = new FindMissingNumberInArray();
		missing.findMissingNumber(arr);
	}

}
