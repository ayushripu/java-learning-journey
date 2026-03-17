package com.TwoDArray;

public class AddingTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{3,4}};
		int b[][]= {{5,6},{7,8}};
		int c[][] = new int [2][2];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				 c[i][j]= a[i][j]+b[i][j];	 
			}
		}
		System.out.print("Sum Of Array is-> \n");
		for(int x[]:c)
		{
			for(int y:x)
			{
				 System.out.print(y+" ");	 
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				 c[i][j]= a[i][j]*b[j][i];	 
			}
		}
		System.out.print("Multily Of Array is :-> \n");
		for(int x[]:c)
		{
			for(int y:x)
			{
				 System.out.print(y+" ");	 
			}
			System.out.println();
		}	
	}
}