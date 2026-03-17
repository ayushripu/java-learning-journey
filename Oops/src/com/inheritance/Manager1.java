package com.inheritance;

public class Manager1 extends Employee1{
	
	String Department;
	Manager1(String Department, double salary, String name, int age)
	{
		super(name, age, salary);
		this.Department="Tester";
	}
	void Display()
	{
		super.display();	
		System.out.println("Department: "+Department);
	}
}
