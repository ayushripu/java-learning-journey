package com.For;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed any Number :-> ");
		int n=sc.nextInt(),rev=0;
		int m=n;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(m==rev)
			System.out.println("Polianrome Number ");
		else
			System.out.println("Not Polindrome");
	}

}
