package com.string;

public class RemoveSpecialCharacter 
{
	public static void main(String[] args) 
	{
		String str="ayushbbu37@gmail.com";
		String g=str.replace("@", "");
		String t=g.replace(".", "");
		System.out.println(t);
	}
}
