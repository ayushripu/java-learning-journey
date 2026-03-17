package com.leetcode;

public class Q_No66 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum[] ;
		int[ ] digits = {2,5,8,9,1};
		
		for(int i=0; i<digits.length; i++)
		{
			System.out.print(digits[i]+" ");
		}
		for(int i=0; i<digits.length; i++)
		{
			if(digits[digits.length-1] < 9)
			{
				System.out.print(digits[i]+" ");
//				System.out.print( digits[digits.length-1] + 1);
				break;
			}
		}
		
//		System.out.println(sum[]);
	}

}
