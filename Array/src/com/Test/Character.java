// fill a character array with all Uppercase alphabet(A,65 to Z,90)
package com.Test;

import java.lang.reflect.Array;

public class Character 
{
	public static void main(String[] args) 
	{
		String a[]=new String[90];
		for(int i='A';i<=a.length;i++)
		{
			System.out.print((char)(i)+" ");
		}
	}
}