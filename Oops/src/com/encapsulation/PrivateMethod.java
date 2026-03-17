package com.encapsulation;

class School
{
	private int roll;	
	private int study(int r)
	{
		this.roll= r;
		int marks = 100;
		System.out.println(r);
		return marks;
	}
	public void print()
	{
		System.out.println(study(89));
	}
}
public class PrivateMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s = new School();
		s.print();
	}
}