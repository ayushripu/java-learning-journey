package com.constructor;

import java.util.Scanner;

class Employee
{
	int id;
	String Name;
	double salary;
	
	public Employee(int id, String Name, double salary)
	{
		this.id = id;
		this.Name = Name;
		this.salary = salary;
	}
	
	public void display()
	{
		System.out.println("Your id is: "+id);
		System.out.println("Your Name is: "+Name);
		System.out.println("Your salary is: "+salary);
	}
}
public class EmployeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Your Name: ");
		String Name = sc.nextLine();
		
		System.out.print("Enter Your Salary: ");
		double salary = sc.nextDouble();
		
		Employee e = new Employee(id, Name, salary);
		e.display();
		
	}

}
