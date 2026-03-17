package com.ConditionalStatement;

public class Swap {
	
	public static void main(String[] args) {
		
		
		int a = 8;
		int b = 4;
		
		System.out.println("Before Swaping"+"\n"+"a = "+ a+"\n"+"b = "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swaping"+"\n"+"a = "+a+"\n"+"b = "+b);

	}
}