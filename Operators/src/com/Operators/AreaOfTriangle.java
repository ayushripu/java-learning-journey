package com.Operators;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) 
	{
		float area,base,height;
		Scanner sc=new Scanner(System.in);
		System.out.println("Inputed base of the area");
		base=sc.nextFloat();
		System.out.println("inputed height of the area");
		height=sc.nextFloat();
		area=1f/2f*base*height;
		System.out.println("Area = "+area);
	}
}