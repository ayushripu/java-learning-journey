package com.mehod;
public class MethodProblem 
{
	static int add(int a,int b,int c)
	{
		System.out.println(c);
		return c;
	}
	public static void main(String[] args) {
		int x=10,y=5,z;
		z=x+y;
		add(x,y,z);
	}
}