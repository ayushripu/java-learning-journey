package com.AccessModifiers;

class C
{
	public int a=10;
	protected int b=20;
	int c=30;
	private int d=40;
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
public class CheckModifiers {

	public static void main(String[] args) {
		 C c=new C();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
//		System.out.println(c.d); 

	}

}
