package com.ds.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeftRotation {

	private static List<Integer> leftRotate(int d, List<Integer> arr) {

		List<Integer> ls = new ArrayList<>();

		int j = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.size() - i <= d) {
				ls.add(arr.get(j));
				j++;
			} else {
				ls.add(arr.get(i + d));
			}
		}

		return ls;

	}

	public static void main(String[] args) {

		System.out.println(leftRotate(5, List.of(1, 2, 3, 4, 5, 6, 8, 9)));

	}

}
