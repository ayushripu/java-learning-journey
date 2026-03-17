package com.string;

public class Q13 {

	public static void main(String[] args) {

		String str = "ayushbbu37@gmail.com";
		
		int a = str.indexOf("@");
		
		String usr = str.substring(0, a);
		String domain = str.substring(a+1, str.length());
		System.out.println("UserName: "+usr);
		System.out.println("Domain: "+ domain);
	} 
}