package com.leetcode;

import java.util.*;

//Example 1:
//
//Input: s = "III"
//Output: 3
//Explanation: III = 3.
//Example 2:
//
//Input: s = "LVIII"
//Output: 58
//Explanation: L = 50, V= 5, III = 3.
//Example 3:
//
//Input: s = "MCMXCIV"
//Output: 1994
//Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
public class Q_No13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a Romal Number");
		input = sc.next().toUpperCase();
//		input=input.toUpperCase();
		char a[] = input.toCharArray();
		for (int i = 0; i < a.length; i++) {
			int v1 = getvalue(a[i]);
			if (v1 == 0) {
				System.out.println("Invalid Method " + a[i]);
				return;
			}

			if (i + 1 < a.length) {
				int value2 = getvalue(a[i + 1]);

				if (v1 < value2) {
					sum += v1; // subtract if smaller before bigger
				} else {
					sum += v1;
				}
			} else {
				sum += v1; // last character always added
			}
		}

		System.out.println("Output: " + sum);
	}

	public static int getvalue(char ch) {
		if (ch == 'I')
			return 1;
		if (ch == 'V')
			return 5;
		if (ch == 'X')
			return 10;
		if (ch == 'L')
			return 50;
		if (ch == 'C')
			return 100;
		if (ch == 'D')
			return 500;
		if (ch == 'M')
			return 1000;

		return 0;
	}
}
