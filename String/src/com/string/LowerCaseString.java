package com.string;

import java.util.Scanner;

public class LowerCaseString 
{
	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Inputed UpperCase String");
		str=sc.nextLine();
		System.out.println("lowerCase String is :- "+str.toLowerCase());
		sc.close();
	}
}
