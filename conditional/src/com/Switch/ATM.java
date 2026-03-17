package com.Switch;

import java.util.Scanner;

public class ATM 
{
	public static void main(String[] args) 
	{
		System.out.println("  Welcome To BoB Atm Machine  ");
		int amt=1000,cre,deb,n,pass=1234;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.print("What's Your Name :-> ");
		name=sc.nextLine();
		System.out.println("\nHello "+name+" Sir ");
		System.out.println("Please Inputed Your 4 Digit ATM Pin");
		n=sc.nextInt();
		if(n==pass)
		{
			System.out.println("Your Pin is Sucessfully Access ");
			System.out.println("What Can i Help You "+name+" Sir\n");
			for(int i=1;;i++)
			{
			System.out.println("\nPress  1 for Check Balance ");
			System.out.println("Press 2 for Credit Amount ");
			System.out.println("Press 3 for Deposite Amount ");
			System.out.println("Press 0 for Exit \n");
			System.out.print("Which Option Do You Choose :-> ");
			n=sc.nextInt();
			if(n==0)
			{
			System.out.println("Thanks For Using BoB World ATM");
			break;
			}
			switch(n)     
			{
			case 1: 
				System.out.print("Your Total Balance is : "+amt);
				break;
			case 2: 
				System.out.print("How Much Rs Do You Want To Credited :-> ");
				cre=sc.nextInt();
				amt=amt+cre;
				System.out.println("Your "+cre+"Rs Suce"
						+ "ssf"
						+ "ully Credited in your Account");
				System.out.println("Your Total Balance is : "+amt);
				break;
			case 3: 
				System.out.print("How Much Rs Do You Want To Deposited :-> ");
				deb=sc.nextInt();
				amt=amt-deb;
				System.out.println("Your "+deb+"Rs Sucessfully Debeted in your Account");
				System.out.println("Your Total Balance is : "+amt);	
			default:
				System.out.println("Invalid Ops`tion");
				break;	
			}
		}
		}
		else
		{
			System.out.println("Invalid Pin");
		}
	}
}
