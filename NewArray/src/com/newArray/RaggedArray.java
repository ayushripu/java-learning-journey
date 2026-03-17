package com.newArray;
import java.util.Scanner;
public class RaggedArray 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		
		String a[][]=new String[4][];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print((i+1)+" Enter the Collection :-> ");
			n=sc.nextInt();
			a[i]=new String [n];
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("ENeter The Item :-> ");
				a[i][j]=sc.next();
			}
			System.out.println();
		}
		System.out.print("Item is :-> ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}