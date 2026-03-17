package com.For;

import java.util.Scanner;

public class PrimeFactor 
{
	public static void main(String[] args) 
	{
		int n,prime=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed any Number :-> ");
		n=sc.nextInt();
		for(int i=1;i<=n/2;i++)
		{
//			System.out.println(i);
			if(n % i == 0)
			{
				prime++;
			}
			sc.close();
		}
			if(prime == 1)
			{
				System.out.println(n+" is a Prime Number");
			}
			else
			{
				System.out.println(n+" is Not a Prime");
			}
	}
}

