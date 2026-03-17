package com.For;

import java.util.Scanner;

class Factorial
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed a Number :-> ");
		int n=sc.nextInt();
		int fact=1;
		sc.close();
		for(int i=1;i<=n;i++)
		{
		        System.out.print(i);
		        if(i<n)
		        {
		        	System.out.print("*");
		        }
			fact=fact*i;
		}
		System.out.print(" = "+fact);
		System.out.println("\nFactorial of "+ n+" is = "+fact);
	}
}