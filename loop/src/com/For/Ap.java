package com.For;

import java.util.Scanner;

public class Ap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed 1st Number :-> ");
		int a=sc.nextInt();
		System.out.print("Inputed 2nd Number :-> ");
		int b=sc.nextInt();
		
		for(int i=a;i<=b;i+=2)
		{
			System.out.print(i);
			if(i<b)
			{
				System.out.print(",");
			}
			
		}

	}

}
