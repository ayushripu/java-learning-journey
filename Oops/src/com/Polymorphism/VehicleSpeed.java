package com.Polymorphism;
class Vehicle
{
	public static void run()
	{
		System.out.println("Vehicle is Running");
	}
}
class Bike extends Vehicle
{
	public static void run()
	{
		System.out.println("Bike is Running");
	}
}
public class VehicleSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Vehicle v = new Bike();
		Vehicle.run();
		Bike.run();
	}

}
