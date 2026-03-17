package com.FirstTest;

import java.util.Scanner;

//print x% of y
public class Q1			
{
	public static void main(String[] args) 
	{
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed Value of y :-> ");
		y=sc.nextInt();
		System.out.print("How Much Increse Percentage :-> ");
		x=sc.nextInt();
		z=(y*x)/100;
		System.out.println(x+" Percentage of "+y+" is = "+z);
		sc.close();
	}
}
