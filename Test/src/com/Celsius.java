package com;

import java.util.Scanner;

public class Celsius 
{							
	public static void main(String[] args) 
	{
		float fer;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed Farenheit :-> ");
		fer=sc.nextFloat();
		float cel=((fer-32)*5)/9;
		System.out.printf("%.2f",cel);
	}
}