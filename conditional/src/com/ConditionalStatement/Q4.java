package com.ConditionalStatement;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed Year :-> ");
		int y=sc.nextInt();
		if(y%4==0 || y%100==0 || y%400==0)
		{
			System.out.println("leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	}

}
