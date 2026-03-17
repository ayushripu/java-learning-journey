package com.mehod;

import java.util.Scanner;

public class PrintName {

	public static void Printname(String name)
	{
		System.out.println("Your Name is :-> "+name);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Inpute Your Name :-> ");
		String name=sc.nextLine();
		
		Printname(name);
		
	}

}
