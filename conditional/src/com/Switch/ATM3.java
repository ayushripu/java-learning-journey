package com.Switch;

import java.util.Scanner;

public class ATM3 {

	public static void main(String[] args) 
	{
		int pin=5689,option,n;
		float Bls=1000,dep,wid;
		String s;
		System.out.print("Enter Your Name :-> ");
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		System.out.println("Hello "+s+" Welcome To Atm Machine");
		System.out.println("What can i help You");
		System.out.println("1. Check Ballence");
		System.out.println("2. Widraw Ballence");
		System.out.println("3. Deposite Ballence");
		System.out.println("0. Exit\n");
		System.out.print("Choose One Option :-> ");
		option=sc.nextInt();
		switch(option)
		{
		case 1: System.out.print("Plz Enter Your Pin :-> ");
			if(pin==5689)
			{
				System.out.println("Your Total Bls is :-> "+Bls);
			}
			else
			{
				System.out.println("Incorect Pin");
			}
			break;
		case 2: System.out.print("Plz Enter Your Pin :-> ");
				n=sc.nextInt();
			if(pin==n)
			{
				System.out.print("How Many Amount You Want To Widraw :-> ");
				wid=sc.nextFloat();
				System.out.println("Widraw Successfull\n If You Want To Check The Ballence\n Press 1\n Exit 0");
				n=sc.nextInt();
				if(n==1)
				{
					System.out.println("Your Total Ballence is "+(Bls-wid));
				}
				else if(n==0)
				{
					System.out.println("Thanks For Using This Atm");
				}
				else
				{
					System.out.println("Invalid Option");
				}
			}
			else
			{
				System.out.println("Invalid Pin");
			}
			break;
		}
		
		
		
	}

}
