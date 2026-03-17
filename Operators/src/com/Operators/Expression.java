package com.Operators;

import java.util.Scanner;

public class Expression {

	public static void main(String[] args) {

		System.out.println("Inputed Base and Height");
		int base,height;
		Scanner sc=new Scanner(System.in);
		base=sc.nextInt();
		height=sc.nextInt();
		float area=base*height/2;
		System.out.println(area);
	}

}
