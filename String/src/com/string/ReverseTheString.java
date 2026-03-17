package com.string;

import java.util.Scanner;

public class ReverseTheString 
{
	public static void main(String[] args) 
	{
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.println("Inputed Some String Word ");
	str=sc.nextLine();
	int rev=0;
	for(int i=str.length();i>=0;i--)
	{
	 rev=str.charAt(i);
	}
	System.out.println(rev);
	}	
}