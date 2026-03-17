package com.While;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		System.out.println("Inputed a Number ");
		Scanner sc=new Scanner(System.in);
		int rev=0,n=sc.nextInt();
		int m=n;
		while(n>0)
		{
			
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
			//System.out.print(r);
			
		}
		
	}

}
