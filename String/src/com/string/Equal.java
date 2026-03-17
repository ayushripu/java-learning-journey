package com.string;
public class Equal 
{
	public static void main(String[] args) 
	{
		String str1="ayush";
		String str2="AYUSH";
		String str3="java";
		String str4="java";
		String str5=new String("ayush");
		String str6=new String("JAVA");
		String str7=new String("JAVA");
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str1.equals(str5));
		System.out.println(str7.equals(str6));
		System.out.println(str4.equals(str7));
	}
}
