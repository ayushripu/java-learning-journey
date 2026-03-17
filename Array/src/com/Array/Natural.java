// Fill Array 1 to n Natural Number 
package com.Array;
import java.util.*;
public class Natural
{
	public static void main(String[] args)
	{
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Inputed How Many Counting Number you Want To Print :-> ");
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;
		}
		System.out.print(Arrays.toString(a)+" ");
		sc.close();
	}
}