package com.leetcode;

// TWO SUM
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 7, 9, 11 };
		int t = 11;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
//            	System.out.println(a[i]+","+a[j]);
				if (a[i] + a[j] == t) {
					System.out.println("Sum of Indexing VAlue: (" + i + "," + j + ")");
				}
			}
		}
	}

}
