package com.Test;
import java.util.Scanner;
public class SumOfArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.print((i+1)+":");
			a[i]=sc.nextInt();
		}
		System.out.println("Your Inputed Element is ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println((i+1)+": "+a[i]);
			sum+=a[i];
		}
		System.out.println("Sum = "+sum);
		
	}
}
