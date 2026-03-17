package com.For;

import java.util.Scanner;

public class FractionalFunction
{
	public static void main(String[] args) 
	{
		int i,n,Factorial=0;
		Scanner sc=new Scanner(System.in);
		sc.close();
		System.out.print("Inputed a Number :->");
		n=sc.nextInt();
		for(i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				Factorial++;
			}
		}
			System.out.println("Factorial of "+n+" is :-> "+Factorial);
	}
}
