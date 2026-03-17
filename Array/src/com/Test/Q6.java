package com.Test;
//.Write a program to swap values of two array
public class Q6 
{
	public static void main(String[] args) 
	{
		int a[]= {2,3,4,5,6};
		int b[]= {7,1,3,4,8};
		int c[] = new int[5];
		System.out.println("Before Swaping");
		System.out.print("a[i]= ");
		for(int i=0; i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nb[i]= ");
		for(int i=0; i<5;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println("\nAfter Swapping");
		for(int i=0; i<5;i++)
		{
			c[i]=a[i];
			a[i]=b[i];
			b[i]=c[i];
		}
		System.out.print("a[i]= ");
		for(int i=0; i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nb[i]= ");
		for(int i=0; i<5;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
