package com.Test;
//Writeaprogramtoprintallprimenumbersfromthearray
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,1,6,8,2,7};
		
		for(int i=0;i<a.length;i++)
		{
			int num = a[i];
			int count=0;
		
		for(int j=1;j<=num;j++)
		{
			if(num%j == 0)
			{
				count++;
			}
		}
		if(count==2)
		{
		System.out.print(num + " ");
		}
	  }
	}
}
