package com.inheritance;

class Vehicle2
{
	public void run()
	{
		System.out.println("Vehicle is Running");
	}
}
class Bike2 extends Vehicle2
{
	public void run()
	{
		System.out.println("Bike is Running saffely");
	}
}

public class Single_inheritance
{
	public static void main(String[] args) {
		Bike2 b = new Bike2();
		
		b.run();
	}
}
