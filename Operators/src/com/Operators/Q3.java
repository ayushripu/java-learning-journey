package com.Operators;

import java.util.Scanner;

//Convert Fahrenheit to celsius
public class Q3
{
	public static void main(String[] args)
	{
		double Fahrenheit,Celsius;
		Scanner Sc=new Scanner (System.in);
		System.out.println("Inputed Degree of Celsius :-> ");
		Celsius=Sc.nextDouble();
		Fahrenheit=((Celsius*9)/5+32);
		System.out.println(Celsius+" Degree Celsius of Fahrenheit is :-> "+Fahrenheit);
		Sc.close();
	}
}
