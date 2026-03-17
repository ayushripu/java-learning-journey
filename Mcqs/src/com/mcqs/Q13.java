package com.mcqs;

public class Q13 {

	public static void main(String[] args) {
		//ted method stubString str1="Java";
		String str1="Java";
		String str2=new String("Java");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode()==str2.hashCode());
	}
}