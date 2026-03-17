package com.string;
//Remove Special Character from a String
//Remove Extra Space from string
//Find Number of word in String
public class Question2 
{
	public static void main(String[] args) 
	{
		String str1=" a!b@c#1$2%3 ";
		String j=str1.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(j);
		
		
		String str2="  abc  de  fgh  ijk";
		String space=str2.replaceAll("\\s+", " ").trim();
		System.out.println(space);
		
		String str3="  abc  de  fgh  ijk";
		str3=str3.replaceAll("\\s+", " ").trim();
		
		
		String count[]=str3.split("\\s");
		System.out.println(count.length);
	}

}
