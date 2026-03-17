package com.ConditionalStatement;

import java.util.Scanner;

public class Radix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n;
		System.out.println("Inputed a Radix Number:->  ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextLine();
		
		if(n.matches("[01]+"))
		{
			System.out.println("Binary Number");
		}
		else if(n.matches("[0-7]+"))
		{
			System.out.println("Octal Number");
		}
		else if(n.matches("[0-9]+"))
		{
			System.out.println("Decimal Number");
		}
		else if(n.matches("[0-9A-F]+"))
		{
			System.out.println("HexaDecimal Number");
		}
		else
		{
			System.out.println("Invalid Option");
		}
	}

}
