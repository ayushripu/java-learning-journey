package com.string;

import java.util.Scanner;

public class CheckIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Website id :-> ");
		String str=sc.nextLine();
	
		int t= str.lastIndexOf(".");
		System.out.println(t);
		String k=str.substring(t+1);
		System.out.println(k);
		if(k.equalsIgnoreCase("com"))
		{
			System.out.println("Commercial Website");
		}
		else if(k.equalsIgnoreCase("org"))
		{
			System.out.println("Originational Website");
		}
		else if(k.equalsIgnoreCase("gov"))
		{
			System.out.println("Goverment Website");
		}
		else
		{
			System.out.println("Wrong Website");
		}
		sc.close();
	}

}
