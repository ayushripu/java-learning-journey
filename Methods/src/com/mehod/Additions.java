package com.mehod;

import java.util.Scanner;

public class Additions {

	public static int sum(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				int c=sc.nextInt();
				int d=sc.nextInt();
				int add=sum(c,d);
				System.out.println(add);
		
	}

}
