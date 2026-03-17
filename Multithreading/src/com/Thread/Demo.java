package com.Thread;
class Demo implements Runnable
{
	public void run()
	{
		System.out.println("Hello");
	}
public static void main(String[]args)
	{
		Demo d=new Demo();
		Thread t=new Thread(d);
		
		t.start();
	}
}
