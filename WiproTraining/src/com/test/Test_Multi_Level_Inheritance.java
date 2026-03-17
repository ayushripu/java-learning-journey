package com.test;
class Employee extends Object
{
	
}
class Manager extends Employee
{
	
}
class Director extends Manager
{
	
}
public class Test_Multi_Level_Inheritance {

	public static void salary(Object obj)
	{
		if(obj instanceof Director)
		{
			System.out.println("Director Sallary 30000");
		}
		else if(obj instanceof Manager)
		{
			System.out.println("Manager Salary 20000");
		}
		else if(obj instanceof Employee)
		{
			System.out.println("Employee Salary 10000");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Employee Object e is Created");
		Employee e=new Employee();
		System.out.println("Manager Object m is Created");
		Manager m=new Manager();
		System.out.println("Director object d is created");
		Director d=new Director();
		
		System.out.println(" Salary(e) is called; ");
		salary(e);
		System.out.println(" Salary(m) is called; ");
		salary(m);
		System.out.println(" Salary(d) is called; ");
		salary(d);
	}
}
