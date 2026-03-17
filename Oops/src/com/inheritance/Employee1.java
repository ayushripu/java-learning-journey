package com.inheritance;

public class Employee1 extends Person1 {
	
	double salary;
	Employee1(String name, int age, double salary)
	{
		super(name,age);
		this.salary= 14000.25;
	}
	void display()
	{
		super.display(name, age);
		System.out.println("Salary: "+salary);
	}
}
