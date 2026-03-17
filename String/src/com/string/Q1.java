package com.string;
import java.util.Scanner;
public class Q1 
{
	public static void main(String[] args) {
	System.out.println("enter a gmail i'd :-> ");
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int i=str.indexOf('@');
	int j=str.indexOf('.');
	String k=str.substring(i+1, j);
	if(k.equalsIgnoreCase("Gmail"))
		{
			System.out.println("Gmail");
		}
	else
		{
			System.out.println("Not");
		}
	}
}
