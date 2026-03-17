package com.Test;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Do you number Do You Want : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print((i+1)+": ");
			a[i]=sc.nextInt();
		}
		System.out.println("Real Element");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nReverse Element");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
