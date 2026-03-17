package com.leetcode;
import java.util.*;
import java.lang.*;
public class Q345 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello";	
		
		List<Character> l1 = new ArrayList<Character>();
		for(int i=0; i<s.length(); i++)
		{
			l1.add(s.charAt(i));
//			l1.add(c);
		}
		
		Set<Character> vowel = new HashSet<>(Arrays.asList(
				'a','e','i','o','u','A','E','I','O','U'
				));
		
		int left = 0;
		int right = s.length()-1;
		
		
//		System.out.println(left +" "+ right);
		while(left < right)
		{
			
			while(left < right && !vowel.contains(l1.get(left)))
			{
				left++;
			}
			
			while(left < right && !vowel.contains(l1.get(right)))
			{
				right--;
			}
			
			char temp = l1.get(right);
			
			l1.set(right, l1.get(left));
			l1.set(left, temp);
			
			left++;
			right--;
		}
		
		StringBuilder sb= new StringBuilder();
		for(char c : l1)
		{
			sb.append(c);
		}
		
		System.out.println(sb.toString());

		
		
		
	}

}
