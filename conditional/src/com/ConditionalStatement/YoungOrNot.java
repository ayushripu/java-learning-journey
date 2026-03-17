package com.ConditionalStatement;

import java.util.Scanner;

public class YoungOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed Age :-> ");
		int a=sc.nextInt();
		if(a>14 && a<55)
		{
			System.out.println("Young");
		}
		else
		{
			System.out.println("Not Young");
		}
	}

}
