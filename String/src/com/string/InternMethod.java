package com.string;
public class InternMethod 
{
	public static void main(String[] args) 
	{
		String str1="Ayush";
		String str2=new String("Ayush").intern();
		String str3="Ayush";
		String str4=new String("Ayush");
		if(str2==str3 || str1==str4) /* str1 is not Equal to str4 but Or(||)
										Operate is checking one condition is 
									 true then result is true*/		
		{
			System.out.println("Equals");
		}
		else
			System.out.println("Not Equal");
	}

}
