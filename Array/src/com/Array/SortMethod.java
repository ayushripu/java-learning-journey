package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortMethod 
{
	public static void main(String[] args) 
	{
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("How Many Number Do You Want :-> ");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		sc.close();
	}
}
