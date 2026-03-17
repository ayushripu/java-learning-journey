package com.list;
import java.util.*;
public class List 
{
	public static void main(String[] args)
	{

		ArrayList l = new ArrayList();

		for(int i =0; i<5 ;i++)
		{
			l.add(12);
			l.add("Aniket");
			l.add(12.5);
		}
		System.out.println(l);
	}
}