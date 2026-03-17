package com.leetcode;
//Input: num = [1,2,0,0], k = 34
//Output: [1,2,3,4]
//Explanation: 1200 + 34 = 1234
public class Q989 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a []= {4,5,5};
			int k=34;
			int num=0;
			for(int i=0;i<a.length;i++)
			{
				num = num * 10 + a[i];
				
			}
			int j = num+k;
			char[] arr = Integer.toString(j).toCharArray();

			for (char c : arr) {
			    System.out.print(c + " ");
			}
			// Output: 1 2 3 4

			
			
	}
}