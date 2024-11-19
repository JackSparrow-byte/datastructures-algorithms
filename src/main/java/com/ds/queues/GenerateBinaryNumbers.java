package com.ds.queues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

	public static String[] generateBinary(int size) {
		String[] result = new String[size];
		Queue<String> q = new LinkedList<>();

		q.offer("1");

		for (int i = 0; i < size; i++) {
			result[i] = q.poll();
			String n1 = result[i] + "0";
			String n2 = result[i] + "1";
			q.offer(n1);
			q.offer(n2);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(generateBinary(15)));

	}

}
