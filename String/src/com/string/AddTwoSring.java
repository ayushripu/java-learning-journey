package com.string;

import java.util.Scanner;

public class AddTwoSring {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed 1st String : ");
		String str=sc.nextLine();
		System.out.print("Inputed 2nd String : ");
		String str2=sc.nextLine();
		String add=str+" "+str2;
		System.out.println(add);
		sc.close();
	}
}
