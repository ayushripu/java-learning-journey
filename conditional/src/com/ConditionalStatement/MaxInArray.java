package com.ConditionalStatement;

import java.util.Scanner;

public class MaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int a[] = new int [5];
		
		for(int i =0; i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i =0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
