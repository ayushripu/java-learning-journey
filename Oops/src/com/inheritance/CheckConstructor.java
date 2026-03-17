package com.inheritance;

class Fruits
{
	Fruits()
	{
		System.out.println("old Good 1" );
	}
	Fruits(int x)
	{
		System.out.println("old Good 2");
	}
}
class NewFruits extends Fruits
{
	NewFruits()
	{
		System.out.println("New Good 1");
	}
	NewFruits(int x)
	{
		super(x);
		System.out.println("new Good 2");	
	}
}
public class CheckConstructor {

	public static void main(String[] args) 
	{
		NewFruits n = new NewFruits(6);
		NewFruits n1 = new NewFruits();
		
//		Completed 

	}

}
