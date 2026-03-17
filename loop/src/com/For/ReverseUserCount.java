package com.For;

import java.util.Scanner;

public class ReverseUserCount
{
	public static void main(String[] args)
	{
		int n1,n2,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed Starting Digit Of Counting :-> ");
		n1=sc.nextInt();
		System.out.print("Inputed ending Digit Of Counting :-> ");
		n2=sc.nextInt();
		System.out.println("Reverse Count of "+n1+" & "+n2+" is :->");
		for(i=n2;i>=n1;i--)
		{
			System.out.println(i);
			sc.close();
		}
	}
}
