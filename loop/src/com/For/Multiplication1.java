package com.For;

import java.util.Scanner;

public class Multiplication1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number = ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		for(i=1;i<=10;i++)
		{
			int j=n*i;
			System.out.println(n+"*"+i+"="+j);
		}

	}

}
