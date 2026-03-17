package com.string;
import java.util.Scanner;
public class FngetChars
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Inputed Some Word ");
		String str=sc.nextLine();
		System.out.print("Which Index Do You Want Start Printing : ");
		int start=sc.nextInt();
		System.out.print("How Many Space Reserved Your Word ");
		int space=sc.nextInt();
		char ch[]=new char[space];
		str.getChars(start, str.length(), ch, 0);
		System.out.println(ch);
		sc.close();
	}
}