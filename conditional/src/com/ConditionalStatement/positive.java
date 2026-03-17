package com.ConditionalStatement;

import java.util.Scanner;

public class positive {

	public static void main(String[] args) {
	
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a Number");
		n=sc.nextInt();
		if(n>0)
			System.out.println("inputed Number is positive");
		else
			System.out.println("Inputed Number is not Positive");
		sc.close();
	}

}
