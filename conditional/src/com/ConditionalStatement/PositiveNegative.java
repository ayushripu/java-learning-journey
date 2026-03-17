package com.ConditionalStatement;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed any Number :-> ");
		int a=sc.nextInt();
		if(a>=0)
		{
			System.out.println("Positive Number");
		}
		else
		{
			System.out.println("Negative Number ");
		}
	}

}
