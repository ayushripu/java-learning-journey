package com.oops;

import java.util.Scanner;

class Number
{
	int a;
	void setA(int b)
	{
		a=b;
	}
	int getA()
	{
		return a;
	}
}
public class MethodDeclaration
{
	public static void main(String[] args)
	{
		System.out.println("Inputed Any Number : ");
		Scanner sc=new Scanner(System.in);
		Number n=new Number();
		n.setA(sc.nextInt());
		System.out.println("Inputed Number is : "+n.getA());
		sc.close();
	}
}
