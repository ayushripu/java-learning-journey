package com.Test;
import java.util.Scanner;
public class MAxorMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]= new int[3];
		for(int i=0;i<a.length;i++)
		{
			System.out.print((i+1)+": ");
			a[i]=sc.nextInt();
			
		}
		int max=a[0];
		int min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
			
		}	
		System.out.println("Max : "+max);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				
			}
		}
		System.out.println("Min= "+min);
	}
}