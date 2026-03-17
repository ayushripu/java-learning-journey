package com.problem;

import java.util.Scanner;

public class Aurthmatic {

	public static void main(String[] args) {
		
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed first Number :-> ");
		a=sc.nextInt();
		System.out.print("Inputed Second Number :-> ");
		b=sc.nextInt();
		
		int sum=a+b;
		int sub=a-b;
		int mult=a*b;
		int div=a/b;
		
		System.out.println("sum ="+ sum);
		System.out.println("sub ="+ sub);
		System.out.println("mult ="+ mult);
		System.out.println("div ="+ div);
	}

}
