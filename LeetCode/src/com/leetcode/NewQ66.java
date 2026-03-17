package com.leetcode;

import java.util.Arrays;

public class NewQ66 
{
    public static void main(String[] args) 
    {
        int a[] = {1,9,9};
        int n = a.length;
        for (int i = n - 1; i >= 0; i--) 
        {
            if (a[i] < 9) 
            {
                a[i]++;
//                System.out.println(a[i]);
                break;  
            }
            else 
            {
                a[i] = 0;  
//                System.out.println(a[i]);
            }
        }
        if(a[0]==0) {
            int b[] = new int[n + 1];
            b[0] = 1;
            for (int x:b) 
            {
                System.out.print(x + " ");
            }
        } 
          
           
           else
            {
            	for(int x:a) 
            	{
            		System.out.print(x+" "); 
            
            	}
            }
    }
}
