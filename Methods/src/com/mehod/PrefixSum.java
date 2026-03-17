package com.mehod;

public class PrefixSum {

	public static void main(String[] args) {
		
		        int[] arr = {10, 20, 30, 40, 50};
		        int[] prefixSum = new int[arr.length];
		        prefixSum[0] = arr[0];
		        for (int i = 1; i < arr.length; i++) {
		            prefixSum[i] = prefixSum[i - 1] + arr[i];
		        }
		        int start = 2;
		        int end = 4;
		        
		        int rangeSum = prefixSum[end];
		        if (start > 0) {
		            rangeSum -= prefixSum[start - 1];
		        }
		        System.out.println("Sum of elements in range [2, 4] is: " + rangeSum);
		    }
		}

