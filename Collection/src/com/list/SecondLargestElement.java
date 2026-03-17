package com.list;
import java.util.ArrayList;

public class SecondLargestElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(35);
        list.add(1);
        list.add(10);
        list.add(34);
        list.add(1);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        System.out.println(Integer.MIN_VALUE);
        for (int num : list) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println(secondLargest);
    }
}