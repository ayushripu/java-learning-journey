package com.Switch;

import java.util.Scanner;

public class Website {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String web;
		System.out.print("Inputed a website Name:- ");
		Scanner sc=new Scanner(System.in);
		web=sc.next();
		int i=web.indexOf(".");
		String k=web.substring(i+1, web.length());
		
		switch(k)
		{
		case "com":
			System.out.println("its Commercial Website");
			break;
		case "gov":
			System.out.println("its Goverment Website");
			break;
		case "org":
			System.out.println("its Orgination Website");
			break;
		case "net":
			System.out.println("its Network Website");
			break;
		}

	}

}
