package com.FirstTest;
import java.util.Scanner;
public class Q2 
{
	public static void main(String[] args)
	{
		int a,b;
		double c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Inpute a Number : ");
		a=sc.nextInt();
		System.out.println("Inputed b Number : ");
		b=sc.nextInt();
		c=Math.pow(a,5)+Math.pow(b,3)/Math.pow(a,4);
		System.out.println(c);
		sc.close();
	}
}