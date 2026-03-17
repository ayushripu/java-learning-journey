package com.Array;
import java.util.Scanner;
public class SecondMax 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed How Many Number Do You Want : ");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int fmax=a[0];
		int smax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]<fmax && a[i]>smax)
			{
				smax=a[i];
			}
		}
		System.out.println("firstMax Number is : "+fmax);
		System.out.println("SecondMax Number is : "+smax);
		sc.close();
	}
}