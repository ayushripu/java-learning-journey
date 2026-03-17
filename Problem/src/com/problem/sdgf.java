package com.problem;

import java.util.Scanner;

public class sdgf {

	public static void main(String[] args) {
		int n,max,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Inputed How Many Number ");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			n=sc.nextInt();
		}
		max=min=a[0];
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}*/
		System.out.println("ds"+a[0]);
	}
}
