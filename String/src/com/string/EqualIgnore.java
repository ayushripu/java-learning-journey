package com.string;

public class EqualIgnore {

	public static void main(String[] args) {
		String Str="AYUSH";
		String str2="ayush";
		String str3=new String("ayush");
		System.out.println(Str.equalsIgnoreCase(str2));
		System.out.println(str3.equalsIgnoreCase(Str));

	}

}
