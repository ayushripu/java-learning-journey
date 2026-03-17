package com.Test;
import java.util.Scanner;
public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print((i+1)+":");
			a[i]=sc.nextInt();
		}
		System.out.println("Inputed Element is");
		for(int i=0;i<a.length;i++)
		{
			System.out.println((i+1)+": "+a[i]);
		}
	}
}