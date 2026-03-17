package com.string;

import java.util.Scanner;

public class CheckReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter Your Name:- ");
		String name = sc.nextLine();
		
//		boolean end= name.endsWith(" boy");
		System.out.println(name.endsWith("boy"));
		
//		String e = name.replace('P','A');
//		
//		System.out.println(e);
		sc.close();
		
	}

}
