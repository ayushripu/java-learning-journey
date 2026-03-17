package com.string;

import java.util.Scanner;

public class InputedFirstName 
{
	public static void main(String[] args) 
	{
		int n;
		String name,Lastname;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed 1st Name :-> ");
		name=sc.nextLine();
		System.out.println("\nWhat's Your Last Name ");
		System.out.println("\n1. Kumar");
		System.out.println("2. Srivastava");
		System.out.println("3. Patel");
		System.out.println("4. Gupta");
		System.out.println("5. Other");
		for(int i=0;;i++)
		{
		
		System.out.print("\nChoose One Option :-> ");
		n=sc.nextInt();
			if(i==n)
			{
				break;
			}
			switch(n)
			{
			case 1:
				System.out.println("Your Full Name is : "+name+" Kumar");
				break;
			case 2:
				System.out.println("Your Full Name is : "+name+" Srivastava");
				break;
			case 3:
				System.out.println("Your Full Name is : "+name+" Patel");
				break;
			case 4:
				System.out.println("Your Full Name is : "+name+" Gupta");
				break;
			case 5:
				System.out.print("Inputed Last Name :> ");
				Lastname=sc.nextLine();
				sc.next();
				System.out.println("Your Full Name is :"+name+" "+Lastname);
				break;
			default:
					System.out.println("Invalid Option");
					break;
			}
		}
		sc.close();
	}

}
