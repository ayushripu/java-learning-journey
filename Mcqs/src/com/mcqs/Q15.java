package com.mcqs;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Java";
		String str2=str1.intern();
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode()==str2.hashCode());
	}

}
