package com.Test;
//Writeaprogramtocounthowmanynumbersare+ve,-veorzerointothearra
public class Q4 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,-4,0,11,0,-3,-5,11};
		int pos=0,neg=0,zer=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				pos++;	
			}
			else if(a[i]<0)
			{
				neg++;
			}
			else
			{
				zer++;	
			}
		}
		System.out.println("Positive Number is "+pos);
		System.out.println("Negative Number is "+neg);
		System.out.println("Zero Number "+zer);
	}
}