package com.inheritance;

public class Person1 {
	String name;
	int age;
	Person1(String name, int age)
	{
		this.name="Ayush";
		this.age=24;
	}
	void display(String name, int age)
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}