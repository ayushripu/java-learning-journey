package com.constructor;

class Parrent
{
	public Parrent()
	{
		System.out.println("Parrent");
	}
}
class Child extends Parrent
{
	public Child()
	{
		System.out.println("Child");
	}  
}
public class ConstructorInInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parrent p=new Parrent();
		Child ch=new Child();
		
		
	}

}
