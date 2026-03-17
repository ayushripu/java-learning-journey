package com.leetcode;
import java.util.*;
public class Q1464 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max,smax,t = 0, u = 0;
		System.out.print("How many Numbers Do You Want: ");
		int n = sc.nextInt();
		
		int num[] = new int[n];
		
		for(int i =0 ; i<num.length; i++)
		{
			System.out.print((i+1)+": ");
			num[i] = sc.nextInt();
		}
		
//		for(int i =0 ; i<num.length; i++)
//		{
//			System.out.print(num[i]+" ");
//		}
		
		max = num[0];
		smax = 0;
		
		for(int i =1 ; i<num.length; i++)
		{
			if(num[i]>max)
			{
				smax=max;
				max=num[i];
			}
			else if (max == num[i])
			{
				int tmax  = max;
				
				t= ((tmax-1)*(max-1));
			}
			else if(num[i]<max && num[i]>smax)
			{
				smax=num[i];
			}
			else if (smax == num[i])
			{
				int fmax  = smax;
				
				u= ((fmax-1)*(max-1));
			}
		}
		System.out.println("\n fmax = "+max+"\n smax= "+smax);
		int j = max-1;
		int k = smax-1;
		
		System.out.println(t);
		System.out.println(u);
		System.out.println(j*k);
		
	}

}
