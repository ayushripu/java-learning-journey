package com.Operators;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double marks;
		System.out.print("Inputed a Marks of Student:-> ");
		Scanner sc=new Scanner(System.in);
		marks=sc.nextDouble();
		
		if(marks>=0 && marks<=30)
		{
			System.out.println("C Grade");
		}
		else if(marks>30 && marks<=60)
		{
			System.out.println("B Grade");
		}
		else if(marks>60 && marks<=90)
		{
			System.out.println("A Grade");
		}
		else if(marks>90 && marks<=100)
		{
			System.out.println("A++ Grade");
		}
		else
		{
			System.out.println("Invalid Inputed");
		}
	}

}
