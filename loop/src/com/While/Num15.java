package com.While;

import java.util.Scanner;
public class Num15
{
	public static void main(String[] args) 
	{
		int i=1,n=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed a Table :-> ");
		n=sc.nextInt();
		while(i<=10)
		{	
			System.out.println(n*i);
			i++;
			sum=sum+(n*i);
			sc.close();
		}
			System.out.println("sum = "+sum);
		
	}
}
