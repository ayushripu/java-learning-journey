package com.Operators;
import java.util.Scanner;
public class Expression2 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		System.out.println("Inputed three Size");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		float s=(a+b+c)/2f;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.printf("%.2f",area);
	}
}