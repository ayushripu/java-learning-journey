package com.problem;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		int i,n,d,store,Sum = 0,sub = 0,mult,div;
		Scanner sc=new Scanner(System.in);
		System.out.println(" -: Chose One Option :- ");
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
		System.out.print("Which Number Do You Want To Choose :- ");
		store=sc.nextInt();
		switch(store)
		{
		case 1:
			System.out.print("\nHow Many Number Do You Want To Add:-> ");
			n=sc.nextInt();
			
			for( i=0;i<n;i++)
			{
				System.out.print("\n"+(i+1)+". Number inputed :-> ");
				d=sc.nextInt();
				Sum=Sum+d;
			}
			System.out.print("\nAddition of all "+i+" Number is :-> "+Sum);
			break;
		case 2:
			System.out.print("\nHow Many Number Do You Want to Subtract:-> ");
			n=sc.nextInt();
			for(i=0;i<n;i++)
			{ 
				System.out.print("\n"+(i+1)+". Inputed Number:- ");
				d=sc.nextInt();
				sub=d-sub;
				
				System.out.println(sub);
			
			}
			break;
		//	System.out.print("\nSubtraction of all "+n+" Number is:  "+sub);
		 }
		
		
		
	}

}
