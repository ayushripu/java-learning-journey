package com.leetcode;
import java.util.*;
public class Q2942 {
        
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l1 = new ArrayList<>();
		
		l1.add("leet");
		l1.add("code");
		
		System.out.println(l1);
		
		char s =   'e';
		int count = 0;
		
		List<Integer> l2 = new ArrayList<>();
		for(int i=0;i<l1.size();i++)
		{
			
			if (l1.get(i).contains(String.valueOf(s)))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
