package com.Demo;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class Marks {
    public static void main(String[] args) {
        int[] marks = {95, 86, 70, 45, 101, 88, -5, 67, 100, 92};
        for (int i = 0; i < marks.length; i++) {
            try {
                if (marks[i] < 0 || marks[i] > 100)
                    throw new InvalidMarksException("Marks must be between 0 and 100. Found: " + marks[i]);
                System.out.println("Student " + (i + 1) + " Marks: " + marks[i]);
            } catch (InvalidMarksException e) {
                System.out.println("Error for Student " + (i + 1) + ": " + e.getMessage());
            }
        }
    }
}