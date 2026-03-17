package com.list;
import java.util.*;
public class FindDuplicates {

	    public static void main(String[] args) {

	        Collection<Integer> list = Arrays.asList(10, 20, 10, 30, 40, 20, 10, 50, 20);

	        Map<Integer, Integer> map = new HashMap<>();

	        // Count frequency
	        for (int num : list) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }

	        // Print duplicates
	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
	            }
	        }
	    }
	}