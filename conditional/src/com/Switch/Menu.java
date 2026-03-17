package com.Switch;

import java.util.Scanner;

public class Menu {
	public static void main(String[]args)
	{
		System.out.println("     Menu      \n");
		System.out.println("\n1. Add\n2. Sub\n3. Div\n4. Mul\n");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter One Option in menu:- ");
		int option =sc.nextInt();
		System.out.print("Enter 1st Number :- ");
		int a=sc.nextInt();
		System.out.print("Enter 2nd Number :- ");
		int b=sc.nextInt();
	
		switch(option)
		{
		case 1:
			System.out.println("You are Choosing option No 1\n");
				int sum=a+b;
				System.out.println("Sum of "+a+"+"+b+"="+sum);
				break;
		case 2:
			System.out.println("You are Choosing option No 2\n");
				int sub=a-b;
				System.out.println("Sub of "+a+"-"+b+"="+sub);
				break;
		case 3:
			System.out.println("You are Choosing option No 3\n");
				int div=a/b;
				System.out.println("div of "+a+"/"+b+"="+div);
				break;
		case 4:
			System.out.println("You are Choosing option No 4\n");
				int Mul=a*b;
				System.out.println("Mul of "+a+"*"+b+"="+Mul);
				break;
		}
	}

}
