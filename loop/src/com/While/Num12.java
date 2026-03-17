package com.While;

import java.util.Scanner;

public class Num12
{
	public static void main(String[] args)
	{
		int n=0,m=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed Starting Digit of Counting :-> ");
		n=sc.nextInt();
		System.out.print("Inputed Last Digit of Counting :-> ");
		m=sc.nextInt();
		while(n<=m)
		{
			System.out.println(n);
			n++;
			sc.close();
		}
	}
}
