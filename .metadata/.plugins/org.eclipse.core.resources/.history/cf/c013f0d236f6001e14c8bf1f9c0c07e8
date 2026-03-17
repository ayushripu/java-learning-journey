package com.Test;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(i+1+". ");
			a[i]=sc.nextInt();
		}
			int t=a[0];
		for(int i=1;i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		a[a.length-1]=t;
		for(int x:a)
		{
			System.out.println(x);
		}
	}

}
