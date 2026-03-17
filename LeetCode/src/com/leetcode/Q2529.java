package com.leetcode;

public class Q2529 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-2,-1,0,0,1,2,3};
		
		int count = 0;
		
		for(int i = 0; i<a.length; i++)
		{
			if(a[i]>=0)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
