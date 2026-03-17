package com.ConditionalStatement;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed any Number :-> ");
		int n=sc.nextInt();
		if(n>=14 && n<=50)
		{
			System.out.println("Young Person");
		}
		else
		{
			System.out.println("Not Young");
		}
	}

}
