package com.For;

import java.util.Scanner;

public class UserCount
{
	public static void main(String[] args)
	{
		int n1,n2,i;
		Scanner sc=new Scanner (System.in);
		System.out.print("Inputes Starting Digit of Counting :-> ");
		n1=sc.nextInt();
		System.out.print("Inputes Last Digit of Counting :-> ");
		n2=sc.nextInt();
		for(i=n1;i<=n2;i++)
		{
			System.out.println(i);
			sc.close();
		}
	}
}
