package com.Polymorphism;

class Calculator
{
	int add(int a, int b)
	{
		int sum = a +b;
		
		System.out.println(sum);
		return sum;
	}
	
	double add(double a, double b)
	{
		double sum = a + b;
		System.out.println(sum);
		return sum;
	}
	
	int add(int a, int b, int c)
	{
		int sum = a + b + c;
		
		System.out.println(sum);
		return sum;
	}
}
public class CalculatorOutput {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		c.add(5, 5);
		c.add(5.6, 6.5);
		c.add(5, 5, 5);
	}

}
