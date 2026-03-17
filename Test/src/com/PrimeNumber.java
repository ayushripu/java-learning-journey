package com;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Number = ");
		int n=sc.nextInt();
		for(int i=0; i< n;i++)
		{
			if(i%n==1)
			{
				System.out.print(i+",");
			}
		}
	}

}
