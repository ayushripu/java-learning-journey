package com.Test;
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print((i+1)+": ");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Before Reverse");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nAfter Reverse");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
