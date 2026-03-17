package com.ConditionalStatement;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("a Inputed Number :-> ");
		a=sc.nextInt();
		System.out.print("b Inputed Number :-> ");
		b=sc.nextInt();
		System.out.print("c Inputed Number :-> ");
		c=sc.nextInt();
		
		if(a>b&&a>c)
		{
			System.out.println("Greather Number is "+a);
		}
		else
		{
			if(b>c)
			{
				System.out.println("Greather Number is "+b);
			}
			else
			{
				System.out.println("Greather Number is "+c);
			}
		}
	}

}
