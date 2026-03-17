package com.Array;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Inputed Element One by one");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==4)
			{
				System.out.println("present in this Array");
			}
			else
			{
				System.out.println("Not Present");
			}
		}

	}

}
