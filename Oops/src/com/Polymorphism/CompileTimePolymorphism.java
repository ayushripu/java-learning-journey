package com.Polymorphism;
public class CompileTimePolymorphism {  // Method OverLoading

	void display()
	{	int a=20,b=30;
		int c=a+b;
		System.out.println("Sum inside Display 1: "+c);
	}
	
	void display(int x, int y)
	{
		int z=x+y;
		System.out.println("Sum inside Display 2: "+z);
	}
	public static void main(String[] args) {
		
		CompileTimePolymorphism c = new CompileTimePolymorphism();
		c.display();
		c.display(50, 5);
		
	}

}
