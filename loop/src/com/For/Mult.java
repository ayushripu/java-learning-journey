package com.For;

import java.util.*;
class Mult
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Which Number Do You Want Print Multiplication Table :");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int d=n*i;
			System.out.println(n+"*"+i+"="+d);
		}
	}
}