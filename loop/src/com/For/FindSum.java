package com.For;

import java.util.Scanner;

public class FindSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum=0;
		System.out.println("Enputed a number ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			
			System.out.print(i);
			if(i<n)
				System.out.print("+");
			sum=sum+i;
		}
		System.out.println("="+sum);
	}

}
