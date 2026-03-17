package com.methodOverRiding;
class Test
{
	void display()
	{
		System.out.println("Hello ");
	}
}
class Test2 extends Test
{
	void display()
	{	
		System.out.println("Hyyy ");
	}
}
public class OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test2();
		t.display();
	}

}
