package com.ConditionalStatement;

public class Febo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		
		int a = 0, b = 1;
		System.out.print(a+","+b+",");
		for(int i =5; i>=1; i--)
		{
			int c= a+b;
			System.out.print(""+c+",");
			a = b;
			b = c;
		}
	}

}
