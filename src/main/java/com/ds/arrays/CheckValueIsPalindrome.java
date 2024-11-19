package com.ds.arrays;

public class CheckValueIsPalindrome {

	public boolean checkForPalindrome(String value) {
		char[] arr = value.toCharArray();
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			if (arr[start] != arr[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		CheckValueIsPalindrome palin = new CheckValueIsPalindrome();
		System.out.println(palin.checkForPalindrome("madam"));
	}

}
