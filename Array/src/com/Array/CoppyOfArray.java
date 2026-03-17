package com.Array;

import java.util.Scanner;

public class CoppyOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Inputed Size of Array :-> ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("inputed "+(i+1)+" Element = ");
			a[i]=sc.nextInt();
		}
		System.out.println("Inputed Element in array [a] is");
		for(int x:a)
		{
			System.out.print(x+",");
		}
		System.out.println("\nAfter Copy");
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int x:b)
		{
			System.out.print(x+",");
		}
	}

}
