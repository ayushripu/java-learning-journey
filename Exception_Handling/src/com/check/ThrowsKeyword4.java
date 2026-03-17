package com.check;

public class ThrowsKeyword4 
{
	public static void main(String[] args) throws InterruptedException
		{
			dostuff();
		}
		public static void dostuff() 
		{
			 domorestuff(); 
		}
		public static void domorestuff()  
	    {
			stuff();
	    }
		public static void stuff() 
	    {
//			Thread.sleep(1000);
	    }
	}
