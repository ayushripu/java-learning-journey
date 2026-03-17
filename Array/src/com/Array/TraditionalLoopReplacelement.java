package com.Array;

public class TraditionalLoopReplacelement {

	public static void main(String[] args) {
		int a[]= {2,3,4};
		for(int i=0;i<a.length;i++)
		{
			int j=a[2];
			a[2]=a[0];
			a[0]=j;
			System.out.println(a[i]);
		}
	}

}
