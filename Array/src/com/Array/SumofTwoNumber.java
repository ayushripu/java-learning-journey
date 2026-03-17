package com.Array;
class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int sum = 0;
        for(int i = 0; i<nums.length; i++)
        {
            for(int j = i+1; j<nums.length; j++)
            {
                sum = nums[i]+nums[j];

                if(sum == target)
                {
                   return new int[]{i,j};
                }
            }
        }
        return new int[] {};
    }
}
public class SumofTwoNumber
{	
	public static void main(String[] args) {
		Solution s = new Solution();
			
		int nums[] = {3,3};
		int target  = 6;
		int[] result = s.twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]);
	}
}