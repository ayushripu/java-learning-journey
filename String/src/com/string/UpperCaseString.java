package com.string;

import java.util.Scanner;

public class UpperCaseString {

	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Inputed Lower Case String ");
		str=sc.nextLine();
			System.out.println("Upper Case String is :- "+str.toUpperCase());	
			sc.close();
	}
}
