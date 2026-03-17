package com.oops;
import java.util.Scanner;
class Cons
{
	int a;
	static int b;
	Cons()
	{
		a=0;
	}
	Cons (int c)
	{
		a=b;
	}
	int getA()
	{
		return a;
	}
}
public class Constructor
{
	public static void main(String[]args)
	{
		System.out.print("Inputed Any Value : ");
		Scanner sc=new Scanner(System.in);
		Cons c=new Cons();
		c.a=sc.nextInt();
		System.out.println("Inputed Value is "+c.getA());
	}
}