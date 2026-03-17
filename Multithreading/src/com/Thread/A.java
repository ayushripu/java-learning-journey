package com.Thread;
class B implements Runnable
{
	public void run()
	{
		System.out.println("runnnnnn");
	}
}
public class A 
{
	public static void main(String[] args) 
	{
//		 TODO Auto-generated method stub
		B b=new B();
		Thread t=new Thread(b);
		t.start();	
	}
}