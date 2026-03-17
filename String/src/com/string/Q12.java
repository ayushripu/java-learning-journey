package com.string;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="ayush@gmail.com";
		
		int a = str.indexOf("@");
		int b = str.lastIndexOf(".");
		if(str.substring(a+1, b).equalsIgnoreCase("gmail") )
		{
			System.out.println("its gmail id");
		}
		else
		{
			 System.out.println("its not gmail id");
		}
	}

}
