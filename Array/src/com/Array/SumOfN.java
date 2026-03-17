package com.Array;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		int n=5,sum=0,even = 0,odd = 0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print((i+1)+": ");
			a[i]=sc.nextInt(); 
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Even :-> "+even);
		System.out.println("odd :-> "+odd);
	}

}
