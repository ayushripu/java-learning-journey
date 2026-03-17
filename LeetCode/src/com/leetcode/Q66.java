package com.leetcode;

import java.util.Arrays;

public class Q66 {
	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			digits[i]++;
			if (digits[i] < 10) {
				return digits;
			}
			digits[i] = 0;
		}
		int[] result = new int[digits.length + 1];
		result[0] = 1;
		return result;
	}
	public static void main(String[] args) {
		int[] digits1 = {1, 2, 3};
		int[] digits2 = {4, 3, 2, 1};
		int[] digits3 = {9, 9, 9};
		
		System.out.println(Arrays.toString(plusOne(digits1))); // [1, 2, 4]
		System.out.println(Arrays.toString(plusOne(digits2))); // [4, 3, 2, 2]
		System.out.println(Arrays.toString(plusOne(digits3))); // [1, 0, 0, 0]
	}
}
