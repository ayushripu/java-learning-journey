package com;

import java.util.*;
class Demo
{
	public static void main(String[]args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Inputed Some Word :");
		str=sc.nextLine();
		System.out.println("Inputed Word is:"+str);
		int word=0,space=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				space++;
			}
			else if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
			{
				word++;
			}
		}
			System.out.println("Total Word is :-> "+(word+1));
			System.out.print("Total Space is :-> "+space);
			sc.close();
	}
}