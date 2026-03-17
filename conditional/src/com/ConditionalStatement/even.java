package com.ConditionalStatement;

import java.util.Scanner;

public class even 
{

	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
			System.out.print("Inputed Any Number :-");
			n=sc.nextInt();
			
		if(n%2==0)
			System.out.println("Inputed Number is Even");
		else
			System.out.println("Inputed Number is not Even");
		sc.close();	
	}

}
