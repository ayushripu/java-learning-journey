package com.Test;
//15.Writeaprogramtofindanumberandreplaceitbygivennumber
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,11,5};
		int replaceNumber=4;
		System.out.println("Before Replaced");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nAfter Replaced");
		for(int i=0;i<a.length;i++)
		{
			a[3]=replaceNumber;
			System.out.print(a[i]+" ");
		}
	}

}
