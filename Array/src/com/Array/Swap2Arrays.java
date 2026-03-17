package com.Array;

import java.util.Scanner;

public class Swap2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		
		int a[]= new int[n];
		int b[]= new int[n];
		int c[]=new int[n];
		Scanner sc=new Scanner(System.in);
		System.out.println("Inputed Value in 1st Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print((i+1)+":");
			a[i]=sc.nextInt();
		}
		System.out.println("Inputed Value in 2nd Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print((i+1)+":");
			b[i]=sc.nextInt();
		}
		System.out.println("Befofe Swapping value of a");
		for(int i=0;i<a.length;i++)
		{
			System.out.print((i+1)+": "+a[i]+"\n");
			
		}
		System.out.println("Befofe Swapping value of b");
		for(int i=0;i<a.length;i++)
		{
			System.out.print((i+1)+": "+b[i]+"\n");
			
		}
		for(int i=0;i<a.length;i++)
		{
			
			c[i]=a[i];
			a[i]=b[i];
			b[i]=c[i];
		}
		System.out.println("after Swapping value of a");
		for(int i=0;i<a.length;i++)
		{
			System.out.print((i+1)+": "+a[i]+"\n");
			
		}
		System.out.println("after Swapping value of b");
		for(int i=0;i<a.length;i++)
		{
			System.out.print((i+1)+": "+b[i]+"\n");
			
		}
	}

}
