// fill array with 1st 100 natural numbers	
package com.Test;
public class Max_2ndMax 
{
	public static void main(String[] args) 
	{
		int a[] = {2,2,3,5,3,3,1};
		int max  = a[0];
		for(int i = 0; i<a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println("Max : "+max);
	}
}
