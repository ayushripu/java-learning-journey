package com.Array;

import java.util.Scanner;

public class TraditionalSum2 
{
	public static void main(String[] args) 
	{
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("How Many Number Inputed :-> ");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=1;i<=a.length;i++)
		{
			n=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum = "+sum);
		sc.close();
	}
}
