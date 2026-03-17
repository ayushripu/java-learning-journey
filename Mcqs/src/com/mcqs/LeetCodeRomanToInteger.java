package com.mcqs;

import java.util.*;
import java.lang.*;
import java.math.*;


public class LeetCodeRomanToInteger {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
//        int a=0,b=0,n=0;
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
           
            int b = in.nextInt();
           
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                a+=b;
                if(j>0)
                System.out.print(" ");
                System.out.print(a);
                b=b*2;
            }
            System.out.println("");
	}
	}
        }