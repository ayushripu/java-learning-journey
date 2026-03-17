package com.Switch;

import java.util.Scanner;

public class Q2 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed MonthNumber : ");
		int m=sc.nextInt();
		switch(m)
		{
			case 1:System.out.println("January");
			break;
			case 2:System.out.println("Feburary");
			break;
			case 3:System.out.println("March");
			break;
			case 4:System.out.println("Aprail");
			break;
			case 5:System.out.println("May");
			break;
			case 6:System.out.println("June");
			break;
			case 7:System.out.println("July");
			break;
			case 8:System.out.println("August");
			break;
			case 9:System.out.println("September");
			break;
			case 10:System.out.println("Octubar");
			break;
			case 11:System.out.println("Numember");
			break;
			case 12:System.out.println("December");
			break;
			default:System.out.println("Invalid Month Number");
			break;
		}
	}
}
