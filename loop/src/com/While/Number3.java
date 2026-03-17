package com.While;

import java.util.Scanner;

public class Number3
{
	public static void main(String[] args)
	{
		int i=1,n=0;
		Scanner sc=new Scanner(System.in);
		System.out.printf("Inputed a Number :-> ");
		n=sc.nextInt();
		while(i<=n)
		{
			System.out.println((i*i)+1);
			i++;
			sc.close();
		}
	}
}
