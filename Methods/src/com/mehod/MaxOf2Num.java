package com.mehod;

import java.util.Scanner;

public class MaxOf2Num {
	
	public static int max(int a, int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed 1st Num= ");
		int a=sc.nextInt();
		System.out.print("Inputed 2nd Num= ");
		int b=sc.nextInt();
		
		int c=max(a,b);
		
		System.out.println(c+" is Greater");
	}

}
