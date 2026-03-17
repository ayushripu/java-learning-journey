package com.test;

public class Swap2Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=10, b=20, c=30, temp;
			System.out.println("Before Swapping \na = "+a+"\nb = "+b+"\nc =  "+c);
			temp = a;
			a = b;
			b = c;
			c = temp;
			System.out.println("After Swapping \na = "+a+"\nb = "+b+"\nc =  "+c);		
	}
}