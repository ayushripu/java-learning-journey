package com.Test;
//.Writeaprogramtocounthowmanytimesanumberpresentinthearray
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,6,8,1,6};
		int key = 6;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				count++;
			}
		}
		System.out.println(key+" is present in "+count+" times");
	}

}
