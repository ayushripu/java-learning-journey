package com.Array;

import java.util.Scanner;

public class StoreElement 
{
	public static void main(String[] args) 
	{
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed some Element :->" );
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array is :- ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
		sc.close();
	}
}
