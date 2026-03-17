package com.string;
//Find if the email id is on gmail
//Find username and domain name from email
public class Question1 {

	public static void main(String[] args) {
		
		String str="programmer@gmail.com";
		int i=str.indexOf('@');
		int j=str.indexOf('.');
		String  st=str.substring(i+1, j);
		System.out.println(st);
		String user=str.substring(0, i);
		System.out.println("User :"+user);
		String Domain=str.substring(i+1, str.length());
		System.out.println("Domain :"+Domain );
		
	}
}
