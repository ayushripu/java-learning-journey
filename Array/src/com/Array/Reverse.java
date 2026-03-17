package com.Array;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{
		int n=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Inputed Some Element : ");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Reverse Number is ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		s.close();
	}
}
