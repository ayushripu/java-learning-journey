package com.Test;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n[]=new int[3];
		for(int i=0;i<n.length;i++)
		{
			System.out.print(i+1+". ");
			n[i]=sc.nextInt();
		}
		int fmax=n[0];
		int smax=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]>fmax)
			{
				smax=fmax;
				fmax=n[i];
			}
			else if(n[i]<fmax && n[i]>smax)
			{
				smax=n[i];
			}
		}
		System.out.println(smax);
		
	}

}
