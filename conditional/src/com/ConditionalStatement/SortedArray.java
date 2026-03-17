package com.ConditionalStatement;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {8,9,2,0,1};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i] > a[j])
				{
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}
			}
		}
		 System.out.println("Sorted Array:");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	}
	}

}
