package com.For;
import java.util.Scanner;
public class LoopName 
{
	public static void main(String[] args)
	{
		int i;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Inputed Your Name :-> ");
		s=sc.next();
		for(i=1;i<=50;i++)
		{
			System.out.println(i+"."+s);
			sc.close();
		}
		
	}
}
