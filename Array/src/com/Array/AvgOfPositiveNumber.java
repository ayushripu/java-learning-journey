package com.Array;

public class AvgOfPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {8,5,4,8,1,-3,6,-2,1,2};
		int count = 0;
		int sum = 0;
		double avg = 1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				
				System.out.println(a[i]+" ");
				sum=sum+a[i];
			
				count++;
				avg = sum/count;
			}
		}
		System.out.println("Sum = "+sum);
		System.out.println("Total Number = "+count);
		
		System.out.printf("Average = %.3f", avg);
		
		
		
	}

}
