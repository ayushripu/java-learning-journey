package com.ConditionalStatement;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int fact = 1;
		
		for (int i = 5; i>=1; i--)
		{
			fact = fact*i;
			System.out.print(i);
			if(i>1)
			{
				System.out.print(" * ");
			}
			
		}
		System.out.print(" = "+fact);
	}

}
