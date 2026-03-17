package com.Thread;

public class DemoThread extends Thread 
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Hello Asus");
			try
			{
				Thread.sleep(100);
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args)
	{
		DemoThread t= new DemoThread();
		{
			t.start();
			for(int i=0;i<=10;i++)
			{
				System.out.println("Ayush");
				try 
				{
					Thread.sleep(100);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}

	}

}
