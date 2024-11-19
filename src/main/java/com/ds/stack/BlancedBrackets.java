package com.ds.stack;

import java.util.Stack;

public class BlancedBrackets {

	public static String isBalanced(String s) {
		if (s.length() % 2 != 0)
			return "NO";

		if (s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')')
			return "NO";

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ')') {
				if (stack.empty() || (stack.pop() != '('))
					return "NO";
			} else if (s.charAt(i) == ']') {
				if (stack.empty() || (stack.pop() != '['))
					return "NO";
			} else if (s.charAt(i) == '}') {
				if (stack.empty() || (stack.pop() != '{'))
					return "NO";
			} else {
				stack.push(s.charAt(i));
			}
		}

		if (stack.empty())
			return "YES";

		return "NO";

	}

	public static void main(String[] args) {
		System.out.println(isBalanced("({[]})"));
		System.out.println(isBalanced("({[})"));
	}

}
