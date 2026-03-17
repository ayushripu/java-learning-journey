package com.ConditionalStatement;

import java.util.Scanner;

public class Q5 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed Day Number : ");
		int d=sc.nextInt();
		if(d==1)
		{
			System.out.println("Monday");
		}
		else if(d==2)
		{
			System.out.println("Tuesday");
		}
		else if(d==3)
		{
			System.out.println("Wednesday");
		}
		else if(d==4)
		{
			System.out.println("Thrusday");
		}
		else if(d==5)
		{
			System.out.println("friday");
		}
		else if(d==6)
		{
			System.out.println("Saturday");
		}
		else if(d==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Invalid DayNumber");
		}
	}
}
