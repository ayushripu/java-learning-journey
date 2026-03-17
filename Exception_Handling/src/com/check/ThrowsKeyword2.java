package com.check;

public class ThrowsKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			for(int i=0;i<10;i++)
			{
				Thread.sleep(1000);
				if(i<9)
				{
					System.out.println((i+1)+":  Ayush");
				}
				else
				{
					System.out.println((i+1)+": Ayush");
				}
			}
		}
		catch(InterruptedException e)
		{
//			System.out.println("Ayush");
		}
		
	}

}
