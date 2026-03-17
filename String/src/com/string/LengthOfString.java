package com.string;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) 
	{
		int length;
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Inputed Some Word");
		str=sc.nextLine();
		length=str.length();
		System.out.println(length);
		sc.close();
	}
}
