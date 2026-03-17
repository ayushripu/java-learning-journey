package com.Test;
import java.util.Scanner;
public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			System.out.print((i+1)+": ");
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nWhich Number You Want To Find : ");
		int key = sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == key)
			{
				System.out.print("Find Number is index: "+(i+1)+" ");
			}
		}
	}
}