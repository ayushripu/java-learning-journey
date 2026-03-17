package com.AccessModifiers;
class A
{
	static int a = 10;
	int b = 20;
	
	int getA()
	{
		return a;
	}
	int getB()
	{
		return b;
	}
	
	void setA(int a)  
	{
		this.a=a;
	}
	void setB(int b)
	{
		this.b=b;
	}
}

public class StaticCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			A a1=new A();
			System.out.println(a1.getA()+" "+a1.getB());
			
			A b1=new A();
			System.out.println(b1.getA()+" "+b1.getB());
			
			a1.setA(55);
			a1.setB(66);
			
			
			b1.setA(90);
			b1.setB(70);
			System.out.println(a1.getA()+" "+a1.getB());
			System.out.println(b1.getA()+" "+b1.getB());
			
			
			
	}

}
