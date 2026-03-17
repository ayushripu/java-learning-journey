package com.Operators;

import java.util.Scanner;

public class RightShift_ {

	public static void main(String[] args) {
	
		int n,k;
		System.out.println("Inputed The Number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("How many bit you want to shift :");
		k=sc.nextInt();
		double y=n/Math.pow(2, k);
		System.out.println(y);
	}

}
