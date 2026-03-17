package com.mehod;

import java.util.Scanner;

public class SumOFTwoNumbers {

		// TODO Auto-generated method stub
		public static int add(int a, int b)
		{
			int sum=a+b;
			return sum;
		}
		
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Inputed 1st Num= ");
			int a=sc.nextInt();
			System.out.print("Inputed 2nd Num= ");
			int b=sc.nextInt();
			
			int sum= add(a,b);
			System.out.println("Sum= "+sum);
	}

}
