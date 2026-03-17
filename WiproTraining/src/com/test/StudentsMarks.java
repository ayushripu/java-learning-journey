package com.test;

import java.util.Scanner;

public class StudentsMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Student Marks : ");
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] >= 35)
			{
				count +=1;
			}
		}
		System.out.println("Total Pass Student is : "+count);
	}

}
