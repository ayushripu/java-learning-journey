package com.ConditionalStatement;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
	int y;
	System.out.println("inputed a year");
	Scanner sc=new Scanner(System.in);
	y=sc.nextInt();

		if(y%4==0)
		{
			if(y%100!=0)
			{
				if(y%400==0)
				{
					System.out.println("Leap Year");
				}
				else
				{
					System.out.println("Not a Leap Year");
				}
			}
			else
			{
				System.out.println("leap Year");
			}
		}
		else
		{
			System.out.println("Not a LeapYear");
		}
	}

}
