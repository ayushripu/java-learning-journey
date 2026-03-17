package com.Test;

import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Length of array");
		int b=sc.nextInt();
		int a[]=new int[b];
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print("a["+i+"] = ");
			 a[i]=sc.nextInt();
		}
		System.out.println("Printed Number is ");
		for(int i=0;i<=a.length-1;i++)
		{
			 System.out.println("a["+i+"] = "+a[i]);
		}
	}

}
