package com.Demo;

import java.io.*;

public class Write
{
	public static void main(String[] args) {
		File t = new File ("c:\\Users\\asus\\Onedrive\\Desktop\\Javaaaa.txt");
		try
		{
			if(t.createNewFile())
			{
				System.out.println("SuccessFully Created");
			}
			else
			{
				System.out.println("Already Created");
			}	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			if(t.exists())
			{
				System.out.println("File Name= "+t.getName());
				System.out.println("Path = "+t.getPath());
				System.out.println("Readable = "+t.canRead());
				System.out.println("Writeable = "+t.canWrite());
				System.out.println("Length = "+t.length());
			}
			else
			{
				System.out.println("File not Existes");
			}
		}
	}
}