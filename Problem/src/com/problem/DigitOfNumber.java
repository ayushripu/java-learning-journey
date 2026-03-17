package com.problem;
public class DigitOfNumber 
{
	public static void main(String[] args)
	{
		int n=257,rem;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			System.out.println(" Digit = "+rem);
		}
		
	}
}
