package com.Switch;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed Website : ");
		String w=sc.next();
		String p=w.substring(w.length()-3, w.length());
		switch(p)
		{
		case "com":System.out.println("Comercial Website");
		break;
		case "gov":System.out.println("Goverment Website");
		break;
		default:System.out.println("Other website");
		break;
		}
	}

}
