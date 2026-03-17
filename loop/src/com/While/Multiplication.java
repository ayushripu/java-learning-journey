package com.While;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		System.out.print("Wchich Number You Want to print table:-");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(i<=10)
		{
			int j=n*i;
			System.out.println(j);
			
			i++;  
		}
		

	}

}
