package com.Operators;

public class PostIncrement {

	public static void main(String[] args) {
		int a=2,b=5,x=4,c;
		c=a*++x + b*--a- a*++x;
		System.out.println(c);

	}

}
