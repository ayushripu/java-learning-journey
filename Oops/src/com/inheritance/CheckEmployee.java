package com.inheritance;
class Employee
{
	String name;
	int id;
	
	Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	void displaydetails()
	{
		System.out.println("Name = "+this.name+"\nid = "+this.id);
	}
}
class Manager extends Employee
{
	String Department;
	Manager(String name,int id,String Department)
	{
		//this.Department=Department;
		super(name,id);
		this.Department=Department;
	}
	@Override
	 void displaydetails()
	 {
		super.displaydetails();
		System.out.println("Department = "+Department);
	 }
}
class Developer extends Employee
{
	String ProgramingLanguage;
	Developer(String name,int id,String ProgramingLanguage)
	{
		super(name,id);
		this.ProgramingLanguage=ProgramingLanguage;
	}
	@Override
	void displaydetails()
	{
		super.displaydetails();
		System.out.println("ProgramingLanguage = "+ProgramingLanguage);
	}
}
public class CheckEmployee {

	public static void main(String[] args) {
		Employee Emp1= new Manager("Ved",101,"HR");
		Employee Emp2= new Developer("Ayush",102,"java");
		Emp2.displaydetails();
		Emp1.displaydetails();
		
	}

}
