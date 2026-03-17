package com.ConditionalStatement;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Inputed Mark :-> ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=80 && n<=100)
		{
			System.out.println("A+ Grade");
		}
		else if(n>=60 && n<80)
		{
			System.out.println("B Grade");
		}
		else if(n>=40 && n<60)
		{
			System.out.println("C Grade");
		}
		else if(n>=0 && n<40)
		{
			System.out.println("Failed");
		}
		else
		{
			System.out.println("Invalid Marks");
		}
	}

}
