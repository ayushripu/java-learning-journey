package com.ConditionalStatement;

import java.util.Scanner;

public class Le {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed year :-> ");
		int i=sc.nextInt();
		if(i%4==0 || i%400==0 || i%100==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not Leap");
		}

	}

}
