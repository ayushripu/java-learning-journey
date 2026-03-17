package com.mehod;

import java.util.Scanner;

public class Check3
{
	public static void printFactorial(int n)
	{	if(n<0)
		{
		System.out.println("Invalid inputed");
		}
		int factorial=1;
		for(int i=n;i>=1;i--)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed The Value Of n:-> ");
		int j=sc.nextInt();
		printFactorial(j);
	}
}