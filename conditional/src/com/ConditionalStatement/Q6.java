package com.ConditionalStatement;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("put Website");
		String
		w=sc.next();
		String p=w.substring(w.length()-3, w.length());
		if(p.equalsIgnoreCase("com"))
		{
			System.out.println("its Comercial Website");
		}
		else if(p.equalsIgnoreCase("gov"))
		{
			System.out.println("its Goverment Website");
		}
		else
		{
			System.out.println("Other Website");
		}
	}

}
