package com.Demo;
import java.io.*;
public class Check{

	public static void main(String[] args) throws Exception
	{
		File fb=new File("C:\\Users\\asus\\OneDrive\\Desktop\\lc.txt");
//		try {
		if(fb.createNewFile()) 
			{
				System.out.println("Dozee");
			}
		else
			{
				System.out.println("already");
			}
//		}
//		catch(Exception e)
//		{
//			System.out.println("Handele");
//		}
		
	}
}