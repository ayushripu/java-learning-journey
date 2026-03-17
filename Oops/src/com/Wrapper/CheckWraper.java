package com.Wrapper;
abstract class Animal
{
	public String name;
	public int age;

	Animal(String name, int age)
	{
		this.name=name;
		this.age= age;
	}
	void eat()
	{
		System.out.println(name + "Eating and age is"+age);
	}
	void sleep()
	{
		System.out.println(name+ "Sleeping at age "+age);
	}
	
	abstract void display();
}
class Lion extends Animal
{
	Lion(String name,int age)
	{
		super(name,age);	
	}

	@Override
	void display()
	{
		System.out.println(name+" is Roar");
	}
}
class Elephant extends Animal
{
	Elephant(String name,int age)
	{
		super(name,age);	
	}
	@Override
	void display()
	{
		System.out.println(name+" is Trumpet");
	}
}
class Monkey extends Animal
{
	Monkey(String name,int age)
	{
		super(name,age);	
	}
	@Override
	void display()
	{
		System.out.println(name+" is Roar");
	}
}
public class CheckWraper {
    public static void main(String[] args)
    {
    	Monkey m=new Monkey("Monkey",22);
    	Elephant e=new Elephant("Elephant",54);
    	Lion l=new Lion("Lion",11);
    	
    	l.eat();
    	l.sleep();
    	l.display();
    	
    	System.out.println();
    	
    	e.eat();
    	e.sleep();
    	e.display();
    	
    	System.out.println();
    	
    	m.eat();
    	m.sleep();
    	m.display();
    	
    	System.out.println();
    }
}
