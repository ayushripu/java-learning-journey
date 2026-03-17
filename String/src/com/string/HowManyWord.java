package com.string;

import java.util.Scanner;

public class HowManyWord 
{
	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner (System.in);
		System.out.println("Inputed Some Word :");
		str=sc.nextLine();
		System.out.println("Inputed Word is :"+str);
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
				c++;
		}
		System.out.println("Total Word is :-> "+(c+1));
		sc.close();
	}
}
