package com.inheritance;
class Employee8
{
	String name;
	double salary;	
	public Employee8(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	public void calculatesalary()
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    } 
	public void calculatesalary(double bonus)
	{
		System.out.println("Employee Salary With bonus: "+(salary+ bonus));			
	}		
}			
class Manager4 extends Employee8				
{			
	double bonus;		
	
	public Manager4(String name, double salary, double bonus)		
	{				
		super(name, salary);		
		this.bonus= bonus;				
	}					
	@Override			
	public void calculatesalary()
	{
		System.out.println("Manager Name: "+name);
		System.out.println("Manager Salary: "+salary);
		System.out.println("Manager Salary after with bonus: "+ (salary + bonus));	
	}
}
public class Q5 
{
	public static void main(String[] args)
	{
		Employee8 e;
		e = new Employee8("Ayush", 50000);
		e.calculatesalary();
		e.calculatesalary(70);
		
		System.out.println();
		
		e =new Manager4("Ved", 90000, 500);
		e.calculatesalary();	
	}
}