package com.leetcode;

import java.util.*;

class Solution {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (char ch : s.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else {
					char top = stack.pop();
				}
			}
		}
		return false;
	}
}

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();

		System.out.println(s.isValid(")"));

	}

}
