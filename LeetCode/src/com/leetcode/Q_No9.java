package com.leetcode;

public class Q_No9 {

	public static boolean palindrome(int x) {
		if (x < 0) {
			return false;
		}
		int temp = x;
		int rev = 0;
		while (temp > 0) {
			int d = temp % 10;
			rev = rev * 10 + d;
			temp = temp / 10;
			if (rev == x) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
//		// TODO Auto-generated method stub

		System.out.println(Q_No9.palindrome(121));

	}

}
