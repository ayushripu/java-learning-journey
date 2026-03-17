package com.Array;

import java.util.Scanner;

public class SM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("How many Number :-> ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0],smax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
		}
	}

}
