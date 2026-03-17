package com.For;

import java.util.Scanner;

public class Numric3 
{

	public static void main(String[] args)
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed a Number :-> ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(i*i*i);
			sc.close();
		}
	}
}