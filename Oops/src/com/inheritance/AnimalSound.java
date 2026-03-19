package com.inheritance;
class Animal10
{
	public void sound()
	{
		System.out.println("Animal Sound");
	}
}
class Dog10 extends Animal10
{
	public void sound()
	{
		System.out.println("Bark");
	}
}
class Cat10 extends Animal10
{
	public void sound()
	{
		System.out.println("Meow");
	}
}
public class AnimalSound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog10 d = new Dog10();
		d.sound();
		
		Cat10 c = new Cat10();
		c.sound();
	}

}
