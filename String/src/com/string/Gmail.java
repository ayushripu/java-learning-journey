package com.string;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ayushbbu37@gmail.com";
		
		int i=str.indexOf("@");
		String userName=str.substring(0, i);
		String Domain=str.substring(i+1, str.length());
		System.out.println(i);
		
		System.out.println("userName= "+userName+"\nDomain= "+Domain);
	}

}
