package com.For;

import java.util.Scanner;

public class Loopyear 
{
	public static void main(String[] args)
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed Last Year :- ");
		n=sc.nextInt();
		for(i=12;i<=n;i=i+4)
		{
			System.out.println(i+"Year");
			sc.close();
		}
	}
}
