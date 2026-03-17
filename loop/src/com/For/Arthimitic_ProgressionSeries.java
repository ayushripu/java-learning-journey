package com.For;

import java.util.Scanner;

public class Arthimitic_ProgressionSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed Last Number :-> ");
		int l=sc.nextInt();
		for(i=5;i<=l;i=i+5)
			System.out.print(","+i);
	}

}
