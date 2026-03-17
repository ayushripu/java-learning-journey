package com.list;
import java.util.*;
public class Nevigable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        NavigableSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println(set.lower(25));   // 20
        System.out.println(set.floor(30));   // 30
        System.out.println(set.ceiling(25)); // 30
        System.out.println(set.higher(30));  // 40
        System.out.println(set.descendingSet()); // [40, 30, 20, 10]
    }
}
