package com.Test;
//9.Writeaprogramtofindsumofelementsinevenindex
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,6,8,1,3}; //15
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				sum+=a[i];
			}
		}
		System.out.println("Sum of all Even index is : "+ sum);
	}

}
