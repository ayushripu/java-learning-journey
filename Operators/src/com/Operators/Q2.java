package com.Operators;
//Convert celsius to Fahrenheit
import java.util.Scanner;
public class Q2 
{
	public static void main(String[] args) 
	{
		double Fahrenheit,celsius;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed degree of fahrenheit : ");
		Fahrenheit=sc.nextDouble();
		celsius=((Fahrenheit-32)*5/9);
		System.out.println(Fahrenheit+" Degree Fahrenheit of Celsius is = "+celsius);
		sc.close();
	}
}
