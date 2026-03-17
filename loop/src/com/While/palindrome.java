package com.While;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			if(rev==m)
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not");
			}
	}

}
