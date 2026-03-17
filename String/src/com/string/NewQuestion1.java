package com.string;

public class NewQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ayushbbu37@gmail.com";
		System.out.println(str);
		
		int g=str.indexOf("@");
		int h=str.indexOf(".");
		
		String username = str.substring(0, g);
		String domain = str.substring(g+1, str.length());
		boolean Domaingmail= domain.startsWith("gmail");
		
		System.out.println("User name is : "+username);
		System.out.println("Domain is : "+domain);
		System.out.println("is it gmail type domain or not : "+Domaingmail);
	}
}