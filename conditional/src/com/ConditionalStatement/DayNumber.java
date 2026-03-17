package com.ConditionalStatement;

import java.util.Scanner;

public class DayNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		System.out.print("Inputd day Number:- ");
		Scanner sc=new Scanner(System.in);
		day=sc.nextInt();
		if(day==1)
		{
			System.out.println("Monday");
		}
		else
		{
			if(day==2)
			{
				System.out.println("Tuesday");
			}
			else
			{
				if(day==3)
				{
					System.out.println("Wednesd  ay");
				}
				else
				{
					if(day==4)
					{
						System.out.println("Thrusday");
					}
					else
					{
						if(day==5)
						{
							System.out.println("Friday");
						}
						else
						{
							if(day==6)
							{
								System.out.println("Saturday");
							}
							else
							{
								if(day==7)
								{
									System.out.println("sunday");
								}
								else
								{
									System.out.println("Invalid option");
								}
							}
						}
					}
				}
			}
		}
	}

}
