package com.For;

import java.util.Scanner;
class Multiplication
{
	public static void main(String[]args)
	{
		int n;
		System.out.print("Inputed Table Number :-> ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.print(n+"*"+i+"="+(n*i)+"\n");
		}
	}
}