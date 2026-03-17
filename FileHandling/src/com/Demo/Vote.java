package com.Demo;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}
public class Vote {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter age :-> ");
		int age=sc.nextInt();
		try 
		{
			if(age < 18)
			{
				throw new InvalidAgeException("Not Eligible");
			}
			else
			{
				System.out.println("Eligible");
			}
		}
		catch(InvalidAgeException e)
		{
				System.out.println("Age Should be greather then 18");
		}

	}

}
