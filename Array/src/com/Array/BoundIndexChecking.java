package com.Array;

import java.util.Scanner;

public class BoundIndexChecking 
{
	public static void main(String[] args) 
	{
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("How Many Number Do You Want : ");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Your Data is : "+a[4]);
		sc.close();
	}
}
