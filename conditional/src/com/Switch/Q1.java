package com.Switch;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed DayNumber :-> ");
		int d=sc.nextInt();
		switch(d)
		{
			case 1: System.out.println("Monday");
			break;
			case 2: System.out.println("Tuesday");
			break;
			case 3: System.out.println("WednesDay");
			break;
			case 4:	System.out.println("Thursday");
			break;
			case 5: System.out.println("Friday");
			break;
			case 6: System.out.println("Saturday");
			break;
			case 7: System.out.println("Sunday");
			break;
			default:System.out.println("Invalid DayNumber");
			
		}
		
	}

}
