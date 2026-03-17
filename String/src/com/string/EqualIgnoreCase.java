
package com.string;

import java.util.Scanner;

public class EqualIgnoreCase {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Inputed 1st String Word");
		String str1=sc.nextLine();
		System.out.println("Inputed 2nd String Word");
		String str2=sc.nextLine();
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Equal Contant");
		}
		else
		{
			System.out.println("Not Equal Contant");
		}
		sc.close();
	}
}
