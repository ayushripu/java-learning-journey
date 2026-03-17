package com.Test;
//9.Writeaprogramtofindsumofelementsinevenindex
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,6,8,1,3};
		int odd=0,even=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even+=a[i];
			}
			else
			{
				odd+=a[i];
			}
		}
		System.out.println("Sum Of Even = "+even);
		System.out.println("Sum Of Odd = "+odd);
	}

}
