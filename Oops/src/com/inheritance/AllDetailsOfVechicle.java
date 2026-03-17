package com.inheritance;

class Vehicle
{
	String brand;
	int Speed;
	Vehicle(String brand,int Speed)
	{
		this.brand="Honda";
		this.Speed=120;
	}
	void displayInfo()
	{
		System.out.println("Brand = "+brand);
		System.out.println("Speed = "+Speed+" km/h");
	}
}
class Car extends Vehicle
{
	int seats=2;
	
	Car(String brand,int Speed,int seats)
	{
		super(brand, Speed);
		this.seats=2;
	}
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Seat = "+seats);
	}
}
class Bike extends Vehicle
{
	String type;
	
	Bike(String brand,int Speed,String type)
	{
		super(brand,Speed);
		this.type="Sports";
	}
	@Override
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("type = "+type);
	}
}
public class AllDetailsOfVechicle
{
	public static void main(String[] args)
	{
		Car c = new Car("Ho", 10, 4);	
		c.displayInfo();
	}
}