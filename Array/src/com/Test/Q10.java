package com.Test;
//12.Writeaprogramtofindmaximumvalueinthearra
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,1};
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Mamimum Number of the array is : "+max);
	}

}
