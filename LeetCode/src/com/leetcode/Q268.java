package com.leetcode;

import java.util.*;
class Q268{
	public static void main(String[]args)
	{
		int nums[]= {2,3,5};
		int n=nums.length;
//		System.out.println(n);
        int missing=0;
        for(int i=0;i<n;i++)
        {
//        	System.out.println("i "+i);
            for(int j=0;j<=n;j++)
            {
            int curr=nums[i];
                if(i!=curr)
                {
                    missing=i+1;
                }
//                else if(n!=nums[i])
//                {
//                	missing = n;
//                }
            }
        }
        System.out.println(missing);
    }
}