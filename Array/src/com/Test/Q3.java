package com.Test;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int b[]= {3,7,1,5,2};
		int c[]=new int[5];
		System.out.print("A[i] = ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nB[i] = ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.print("\nC[i] = ");
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
			System.out.print(c[i]+" ");
		}
		
	}

}
