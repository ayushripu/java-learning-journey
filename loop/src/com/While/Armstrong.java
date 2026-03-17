package com.While;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,j=1;
		System.out.println("Enputed Number ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int r = 0;
		while(n>0)
		{
			 r=n%10;
			n=n/10;
			j=j+r*r*r;
		}
		if(j==n)
		{
			System.out.println("armstrong Number");
		}
		else
		{
			System.out.println("Not ArmstrongS");
		}
		
	}

}
