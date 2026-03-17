package com.leetcode;

public class QNO231 {
	static class Solution {
		public boolean isPowerOfTwo(int n) {

			if (n < 0) {
				return false;
			}
			int j = 0;
			int temp = n;
			while (temp > 0) {
				temp = temp / 2;
//             System.out.println(temp);
				if (Math.pow(2, temp) == n) {
					return true;

				}
				while (n % 2 == 0) {
					n = n / 2;
				}
				if (n == 1) {
					return true;
				} else {
					return false;
				}

			}
			return false;

		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isPowerOfTwo(16));
		System.out.println(s.isPowerOfTwo(1));
		System.out.println(s.isPowerOfTwo(3));
		System.out.println(s.isPowerOfTwo(8));
	}
}