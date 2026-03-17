package com.mehod;

import java.util.Scanner;

public class Poliandrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.printf("inputed Number :-> ");
		int n=sc.nextInt();
		int r=0;
		while(n>0)
		{
			int c=n/10;
			r=r*10+c;
			 n=n/10;
		}
		System.out.println("Reverse the all number : "+r);
		if(n==r)
			System.out.println("True");
		else
		System.out.print("False");
		
	}

}
