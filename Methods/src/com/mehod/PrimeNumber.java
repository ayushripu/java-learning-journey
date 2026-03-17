package com.mehod;

import java.util.Scanner;

public class PrimeNumber {
	
	static boolean check(int n)
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :-> ");
		int n=sc.nextInt();
		
		boolean s= check(n);
		System.out.println("p= "+s);

	}

}
