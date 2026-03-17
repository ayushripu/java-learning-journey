package com.Grade;

import java.util.Scanner;

public class GradeCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many subjects do you have? ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        int total = 0;

        for (int i = 0; i < numSubjects; i++)
        {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();

            while (marks[i] < 0 || marks[i] > 100)
            {
                System.out.println("Please enter marks between 0 and 100.");
                System.out.print("Enter again for subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
            }

            total += marks[i];
        }

        double average = (double) total / numSubjects;

        String grade;
        if (average >= 90) 
        {
            grade = "A+";
        }
        else if (average >= 80) 
        {
            grade = "A";
        } 
        else if (average >= 70) 
        {
            grade = "B";
        }
        else if (average >= 60) 
        {
            grade = "C";
        }
        else if (average >= 50) 
        {
            grade = "D";
        } 
        else 
        {
            grade = "F";
        }

        System.out.println("\n--- Result ---");
        System.out.println("Total: " + total + " out of " + (numSubjects * 100));
        System.out.printf("Average: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
