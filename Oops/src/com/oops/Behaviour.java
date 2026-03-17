package com.oops;

//import java.util.Scanner;

class Myclass
{
	int a;
	static int b;
	void setA(int c)
	{
		a=c;
		b=c;
		
	}
	int getA()
	{
		return a;
	}
	static void print()
	{
		Myclass m=new Myclass();
		m.a=b;
		System.out.println("a Value is : "+m.a);
	}
}
public class Behaviour 
{
	public static void main(String[] args) 

	{
//		System.out.print("Inputed Any Value : ");
//		Scanner sc=new Scanner(System.in);
		Myclass m=new Myclass();
		m.setA(9);
		System.out.println("Inputed Value is "+m.getA());
		Myclass.print();
	}

}
