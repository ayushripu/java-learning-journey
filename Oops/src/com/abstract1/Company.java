package com.abstract1;
abstract class Employee
{	
	private int salary;
	abstract void calculateSalary();
	public Employee(int salary)
	{
		this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int sal)
	{
		this.salary=sal;
	}
}
class Manager extends Employee
{
	int bonus;
	public Manager(int salary,int bonus)
	{
		super(salary);
		this.bonus=bonus;
	}
	public void calculateSalary()
	{
		int totalsalary = this.getSalary()+bonus;
		this.setSalary(totalsalary);
		System.out.println("Totalsalary = "+totalsalary);
	}
}
public class Company 
{
	public static void main(String[] args)
	{
		Manager m = new Manager(100, 50);
		m.calculateSalary();
	}
}