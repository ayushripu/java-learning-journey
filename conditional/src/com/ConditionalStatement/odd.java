package com.ConditionalStatement;

import java.util.Scanner;

public class odd
{

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Inputed 1st Number :-> ");
		n=sc.nextInt();
		if(n%3==0 || (n&1)==1)
			System.out.println("Inputed Number is odd");
		else
			System.out.println("Inputed Number is not odd");
		sc.close();
	}

}
