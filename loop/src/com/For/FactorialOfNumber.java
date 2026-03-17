package com.For;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1,n;
		System.out.println("Inputed factorial Number ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.print(i);
			if(i<n)
			{
				System.out.print("*");
			}
			fact=fact*i;
		}
		System.out.println("="+fact);
			
	}

}
