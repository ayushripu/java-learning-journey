package com.string;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c[]=  {'A','B','C','D'};
		
		byte a[] = {65,66,67,68};
		String str = new String (c);
		
		String str2 = new String (a,1,3);
		
		System.out.println("str : "+str);
		System.out.println("str2: "+str2);
	}

}
