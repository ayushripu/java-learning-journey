package com.Set;
import java.util.*;
public class Iterable {
	

	    public static void main(String[] args) {
	        HashSet<Integer> set = new HashSet<>();
	        set.add(10);
	        set.add(20);
	        set.add(30);
	        System.out.println("Set "+set);
	        Iterator<Integer> it = set.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }
	    }
	}
