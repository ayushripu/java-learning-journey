package com.ConditionalStatement;

import java.util.Scanner;

public class Network {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url;
		System.out.print("Enter a Website URL:- ");
		Scanner sc=new Scanner(System.in);
		url=sc.next();
		
		String j=url.substring(0,url.indexOf(":"));
		
		if(j.equals("http"))
		{
			System.out.println("\nHyper Text Transfer Protocol");
		}
		else 
		{
			if(j.equals("ftp"))
			{
			System.out.println("\nFile transfer Protocol");
			}
			else
			{
				System.out.println("not");
			}
		}
		
		int k=url.lastIndexOf(".");
		String g=url.substring(k+1, url.length());
		
		if(g.equals("com"))
		{
			System.out.println("and its a Commercial Website");
		}
		else
		{
			if(g.equals("gov"))
			{
				System.out.println("and its a Goverment Website");
			}
			else
			{
				System.out.println("Illegial Website name");
			}
		}
	}

}
