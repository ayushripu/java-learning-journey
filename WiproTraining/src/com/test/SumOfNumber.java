package com.test;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.print((i+1)+" Number is : ");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Total Sum "+ sum);
		
	}

}
