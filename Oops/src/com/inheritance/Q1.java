package com.inheritance;

class Parent
{
	void show()
	{
		System.out.println("This is Parrent Calss");
	}
	
}
class Child extends Parent
{
	void show()
	{
		super.show();
		
		System.out.println("This is child class");
	}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		c.show();
	}

}
