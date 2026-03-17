package com.string;

import java.util.Scanner;

public class LengthOfStringWithoutSpace {

	public static void main(String[] args)
	{
		int c=0;
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Inputed Some Word");
		str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
				c++;
		}
		System.out.print("Length Without Space :- "+c);
		sc.close();
	}

}
