package com.lembda;

interface Add
{
	int sum(int a, int b);
}

public class Write {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Add a = new Add() {
			public int sum(int a, int b)
			{
				return a+b;
			}
		};
		System.out.println(a.sum(5, 7));
	}
}