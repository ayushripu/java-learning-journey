package com.Operators;

import java.util.Scanner;

public class Expression3 //Root Of Quadratic Equation
{
	public static void main(String[] args) 
	{
		int a,b,c;
		System.out.println("Inputed Three Value ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		double r1=(-b+Math.sqrt((b*b)-4*a*c))/(2*a);
		double r2=(-b-Math.sqrt((b*b)-4*a*c))/(2*a);
		System.out.println(r1+"\n"+r2);
		
	}
}