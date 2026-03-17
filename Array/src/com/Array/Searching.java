package com.Array;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Inputed How Many Elemenet :-> ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print("which key you want to find :-> ");
		int f=sc.nextInt();
		int[] a1=new int[a];
		for(int i=0;i<=a1.length;i++)
		{
			a1[i]=sc.nextInt();
			if(a1[i]==f)
			{
				System.out.println("found at index"+i);
			}
			else
			{
				System.out.println("Not found");
			}
		}
	}

}
