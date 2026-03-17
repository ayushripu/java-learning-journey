package com.Array;

import java.util.Scanner;

public class MaxAgain 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.print("Inputed How Much Do you Want :-> ");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=max)
			{
				max=a[i];
			}
		}
		System.out.println("Max ="+max);
	}
}
