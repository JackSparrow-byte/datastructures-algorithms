package com.ds.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondMaxValue {

	public class FindSecondMaxValueInStream {
		public void findUsingStreams(int[] array) {
			Integer integer = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

			System.out.println("In Inner class Streams O/P " + integer);
		}
	}

	public void findUsingCore(int[] arr) {

		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secMax = max;
				max = arr[i];
			} else if (arr[i] > secMax && arr[i] != max) {
				secMax = arr[i];
			}
		}
		System.out.println("The Second Max is  " + secMax);
	}

	public static void main(String[] args) {
		int[] arr = { 24, 345, 13, 55, 67, 23, 57 };

		FindSecondMaxValue max = new FindSecondMaxValue();
		max.findUsingCore(arr);

		FindSecondMaxValue.FindSecondMaxValueInStream innerMax = max.new FindSecondMaxValueInStream();
		innerMax.findUsingStreams(arr);

	}

}
