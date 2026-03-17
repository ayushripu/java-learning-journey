package com.Operators;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Enter the age of Person:-> ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>=18)
		{
			System.out.println("Young");
		}
		else
		{
			System.out.println("Not Young");
		}
			
	}

}
