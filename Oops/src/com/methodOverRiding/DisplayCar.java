package com.methodOverRiding;
class Car
{
//	public void start()
//	{
//		System.out.println("Car is Started through a key");
//	}
//	public void accelrate()
//	{
//		System.out.println("Heighest Speed of the car is 120km\'h");
//	}
	void gear()
	{
		int a=7,b=8;
		int c= a+b;
		System.out.println("Manual Gear Available "+c);
	}
}
class LuxaryCar extends Car
{
	void gear(int x, int y)
	{
		int c = x+y;
		System.out.println("Automatic Gear Available "+c);
		 
	}
//	public void Roof()
//	{
//		System.out.println("SunRoof is Available");
//	}
}
public class DisplayCar {

	public static void main(String[] args)
	{
		LuxaryCar c=new LuxaryCar();
//		c.start();
//		c.accelrate();
		c.gear();
//		c.Roof();
		
	}

}
