package com.While;

import java.util.Scanner;
public class Num20 
{
	public static void main(String[] args) 
	{
		int i=1,n=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed a Number :-> ");
		n=sc.nextInt();
		while(i<=n)
		{
			System.out.print(i+"+");
			i++;
			if(i<=n)
			{
				System.out.print(i);
				i++;
				if(i<n)
				{
					System.out.print("-");
				}
			}
			sc.close();
		}
		
	}
}
