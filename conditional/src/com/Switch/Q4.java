package com.Switch;

import java.util.Scanner;

public class Q4 
{
	public static void main(String[] args) 
	{	
		System.out.println("	Hello Bachoo	\n"	);
		System.out.println("Choose any One if You want calculate something \n");
		System.out.println("1. Sum");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide\n");
		System.out.print("What do You Want :-> ");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		switch(c)
		{
		case 1:System.out.println("You Want any Types of Two Number Add \n");
		       System.out.print("Inputed 1st Number : ");
		       int a=sc.nextInt();
		       System.out.print("Inputed 2nd Number : ");
		       int b=sc.nextInt();
		       int sum=a+b;
		       System.out.println("\nYour Total Sum is = "+sum);
		       break;
		case 2:System.out.println("You Want any Types of Two Number Subtract \n");
	       System.out.print("Inputed 1st Number : ");
	       int l=sc.nextInt();
	       System.out.print("Inputed 2nd Number : ");
	       int z=sc.nextInt();
	       int sub=l-z;
	       System.out.println("\nYour Total Subtraction is = "+sub);
	       break;
		case 3:System.out.println("You Want any Types of Two Number Multiply \n");
	       System.out.print("Inputed 1st Number : ");
	       int g=sc.nextInt();
	       System.out.print("Inputed 2nd Number : ");
	       int o=sc.nextInt();
	       int Mul=g*o;
	       System.out.println("\nYour Total Multiplication no is = "+Mul);
	       break;
		case 4:System.out.println("You Want any Types of Two Number Divide \n");
	       System.out.print("Inputed 1st Number : ");
	       int f=sc.nextInt();
	       System.out.print("Inputed 2nd Number : ");
	       int t=sc.nextInt();
	       int div=f/t;
	       System.out.println("\nYour Total	divisible no is = "+div);
	       break;
	       default:System.out.println("Invalid Option ");
	       break;
		}
	}

}
