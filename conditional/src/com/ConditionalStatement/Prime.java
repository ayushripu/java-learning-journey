package com.ConditionalStatement;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 12;
		boolean prime = true;
		
		if(n <= 1)
		{
			prime = false;
		}
		else
		{
			for(int i = 2; i<=n/2; i++)
			{
				if(n%2 == 0)
				{
					prime =  false;
				}
			}
		}
		
		if(prime)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("NotPrime");
		}
	}

}
