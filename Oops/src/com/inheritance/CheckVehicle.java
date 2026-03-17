package com.inheritance;
class Vehicleee
{
	Vehicleee()
	{
		System.out.println("Vehicle is created");
	}
	void start()
	{
		System.out.println("Vehicle is starting");
	}
}
class MoterCycle extends Vehicleee
{
	MoterCycle()
	{
		super();
		{
			System.out.println("MoterCycle is Created");
		}
	}
	@Override
	void start()
	{
		System.out.println("MoterCycle is Start");
	}
}
class FourWheeler extends Vehicleee
{
	FourWheeler()
	{
		super();
		{
			System.out.println(" FourWheeler is Created");
		}
	}
	@Override
	void start()
	{
		System.out.println(" FourWheeler is Starting");
	}
}
public class CheckVehicle 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Vehicleee[] ve=new Vehicleee[2];
		ve[0] = new MoterCycle();
		ve[1] = new FourWheeler();
		for(Vehicleee v : ve)
		{
			v.start();
		}
	}
}