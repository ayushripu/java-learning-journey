package com.string;

import java.util.Scanner;

public class MatchingElement 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Inputed 1st String");
		String str1=sc.nextLine();
		System.out.println("Inputed 2nd String");
		String str2=sc.nextLine();
		System.out.println("Which Index Do You Want To Start Print ");
		int start=sc.nextInt();
		System.out.println("How many Space reserved Your Word  ");
		int space=sc.nextInt();
		char[] ch=new char[space];
		Boolean Match=str1.regionMatches(start, str2, start, space);
		if(Match)
		{
			System.out.println("Yes Matching Element");
		}
		else
		{
			System.out.println("Not Matching");
		}
		System.out.println("Matching Word is : "+ch);
		sc.close();
	}
}
