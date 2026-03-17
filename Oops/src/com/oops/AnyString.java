package com.oops;

import java.util.Scanner;

class Nam
{
	String name;
		void setA(String  b)
		{
			name=b;
		}
		String getA()
		{
			return name;
		}
}
public class AnyString 
{
	public static void main(String[] args) 
	{
		System.out.println("Inputed Any String Word ");
		Scanner sc=new Scanner(System.in);
		Nam n=new Nam();
		n.setA(sc.nextLine());
		System.out.println("Inputed Word is : "+n.getA());
		sc.close();
	}
}
