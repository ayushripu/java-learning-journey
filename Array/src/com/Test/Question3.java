package com.Test;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		for(int i=0;i<a.length;i++)
		{
			System.out.print(i+1+". ");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
		}
		System.out.println("MAx = "+max);
	} 

}
