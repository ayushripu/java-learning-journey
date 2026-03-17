package com.While;

import java.util.Scanner;

public class Number8 
{
	public static void main(String[] args) 
	{
	int i=12,n=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Inputed A Number :-> ");
	n=sc.nextInt();
	while(i<=n)
	{
		System.out.println(i+"year");
		i=i+4;
		sc.close();
	}
	}
}
