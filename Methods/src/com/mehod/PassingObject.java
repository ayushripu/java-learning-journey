package com.mehod;

public class PassingObject {
	
	static void update(int a[])
	{
		a[0]=55;
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			 
			update(a);
			System.out.print(a[i]+" ");
		}
		

	}

}
