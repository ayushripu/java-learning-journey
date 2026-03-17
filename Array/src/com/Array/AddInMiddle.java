package com.Array;

public class AddInMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,40};
		int b[] = new int[a.length + 1];
		int j=0;
		 
		for(int i=0;i<b.length;i++)
		{
			
			if(i==2)
			{
				b[i] = 30;
			}
			else
			{
				b[i]=a[j];
				j++;
			}
			
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(i+" "+b[i]);
		}
	}
}
