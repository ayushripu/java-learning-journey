package com.Array;

import java.util.Scanner;

public class CheckingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Searching Element :-> ");
		Scanner sc=new Scanner(System.in);
		int Key=sc.nextInt();
		System.out.print("Enter length of the element :-> ");
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==Key)
			{
				System.out.println("Find "+Key+" is index No "+i);
			}
		}
	}

}
