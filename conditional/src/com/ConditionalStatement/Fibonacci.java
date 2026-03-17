package com.ConditionalStatement;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int a = 0, b= 1;
		
		System.out.print(a+","+b+",");
		for(int i = 0; i<=n; i++)
		{
			int c = a+b;
			System.out.print(c);
			if(i<n)
			{
				System.out.print(",");
			}
			
			a = b;
			b = c;
			
		}
	}

}
