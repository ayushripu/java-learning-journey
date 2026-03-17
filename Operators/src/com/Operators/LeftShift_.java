package com.Operators;

import java.util.Scanner;

public class LeftShift_ {

	public static void main(String[] args) {
		int n,k;
		System.out.print("Inputed the Number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print("How Many Bit You Want to Sift :- ");
		k=sc.nextInt();
		
		double z=n*(Math.pow(2, k));
		System.out.println("after Shifting "+k+" bit Your Total Numer is :"+z);
	}

}
