package com.linkedlist;
class Voice
{
	Voice()
	{
		System.out.println("Dog is bark");
	}
}
class Dog extends Voice
{
	Dog()
	{
		super();
		System.out.println("CAt");
	}
	public void display()
	{
		System.out.println("Hello");
	}
}
public class DogPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d= new Dog();
		d.display();
	
	}

}
