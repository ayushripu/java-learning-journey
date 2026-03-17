 package com.ConditionalStatement;

import java.util.Scanner;

public class RadixNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed Radix Number:-> ");
		String s=sc.nextLine();
		if(s.matches("[01]+"))
		{
			System.out.println("Binary Radix is :-> 2");
		}
		else if(s.matches("[0-7]+"))
		{
			System.out.println("Octal Radix :-> 8");
		}
		else if(s.matches("[0-9]+"))
		{
			System.out.println("Decimal Radix :-> 10");
		}
		else if(s.matches("[0-9A-F]+"))
		{
			System.out.println("HexaDecimal Radix :-> 16");
		}
	}

}
