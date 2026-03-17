package com.list;
import java.util.*;

public class Leetcode989 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("How Many Numbers Do You Want: ");
     int num = sc.nextInt();
     List <Integer> l1 =new ArrayList<>();
     
     for(int i = 1; i <= num; i++)
     {
    	 System.out.print(i+": ");
    	 l1.add(sc.nextInt());
     }
     System.out.print("Input Key Value: ");
     int key = sc.nextInt();
     
     System.out.println("\nNum = "+l1);
     System.out.println("Key = "+key);
     
     List <Integer> result =new ArrayList<>();
     
     int i = num-1;
     int carry = 0;
     int result1,result2;
     while(i >= 0 || key > 0 || carry> 0)
     {
    	 if(i >= 0)
    	 {
    		 result1 = l1.get(i);	//2
    	 }
    	 else
    	 {
    		 result1 = 0;44                                                      
    	 }
    	 result2 = key%10;   //1
    	 int sum = result1 + result2 + carry; //4
    	 
    	 result.add(sum%10);	//4
    	 carry = sum/10;
    	 key = key / 10;
    	 
    	 i--;
    	 
     }
     System.out.println("Before Reverse :"+result);
     Collections.reverse(result);
     System.out.println("After Reverse Final list :"+result);
     
    }
}
