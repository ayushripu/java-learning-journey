package com.ConditionalStatement;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("1. Maths Mark :-> ");
		int a=sc.nextInt();
		System.out.print("2. Science Mark :-> ");
		int b=sc.nextInt();
		System.out.print("3. Computer Mark :-> ");
		int c=sc.nextInt();
		System.out.print("4. English Mark :-> ");
		int d=sc.nextInt();
		System.out.print("5. Hindi Mark :-> ");
		int e=sc.nextInt();
		int total=(a+b+c+d+e);
		double avg=total/5;
		System.out.println("Total Percentage is :"+avg+"%");
		if(avg>=70 && avg<=100)
		{
			System.out.println("Grade : 'A'");
		}
		else if(avg>60 && avg<70)
		{
			System.out.println("Grade : 'B'");
		}
		else if(avg>50 && avg<60)
		{
			System.out.println("Grade : 'C'");
		}
		else
		{
			System.out.println("Once Again Paricipate in This Exam");
		}
		
	}

}
