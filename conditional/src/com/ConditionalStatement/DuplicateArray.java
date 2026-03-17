package com.ConditionalStatement;
public class DuplicateArray 
{
	public static void main(String[] args) 
	{
		int a[] = {1,6,9,3,6,5,5};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.println("Duplicate = "+ a[i]);
					break;
				}
			}
		}
	}
}