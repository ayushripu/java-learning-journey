package com.For;

import java.util.Scanner;

public class NastedLoop5 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed a Table Number : ");
		n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			for(int j=2;j<=n;j++)
			{
				System.out.print(j+" * "+i+" = "+(j*i)+" ");
				sc.close();
			}
			System.out.println("");
		}
	}
}
