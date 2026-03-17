package com.newArray;

import java.util.Scanner;

public class Subject {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		double sum=0.0;
		System.out.print("Inputed How Many Student :-> ");
		n=sc.nextInt();
		int student[][]=new int[n][3];

		for(int i=0;i<student.length;i++)
		{
			System.out.println("Inputed "+(i+1)+" Subject marks");
			for(int j=0;j<student[i].length;j++)
			{
				student[i][j]=sc.nextInt();
			}
		}
		System.out.println("Total Subject of marks is ");
		for(int i=0;i<student.length;i++)
		{
			for(int j=0;j<student[i].length;j++)
			{
				System.out.print(student[i][j]+"\t");
				sum+=student[i][j];
				
			}
			System.out.print(sum+"\t");
			
		}
	}
}