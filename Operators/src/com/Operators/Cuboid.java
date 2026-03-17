package com.Operators;

import java.util.Scanner;

public class Cuboid {

	public static void main(String[] args) {
		int length,breadth,height;
		System.out.println("Inputed Length Breadth and Height ");
		var sc=new Scanner(System.in);
		length=sc.nextInt();
		breadth=sc.nextInt();
		height=sc.nextInt();
		int volume=(length*breadth*height);
		int TotalArea=2*(length*breadth+breadth*height+length*height);
		System.out.println("Volume -> "+volume);
		System.out.println("TotalArea -> "+TotalArea);

	}

}
