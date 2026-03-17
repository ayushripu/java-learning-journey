package com.mehod;

import java.util.Scanner;

public class Max {
	
	public static int max(int a,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int d=sc.nextInt();;
		
		int Maximum=max(c,d);
		System.out.println(Maximum);

	}

}
