package com.game;
import java.util.Random;
import java.util.Scanner;
public class NumberGame
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalRounds = 0;
        int roundsWon = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        boolean playAgain;
        do 
        {
            totalRounds++;
            int numberToGuess = random.nextInt(100)+1; 
            int maxAttempts=7;
            int attempts = 0;
            boolean guessedCorrectly = false;
            System.out.println("\n I have picked a number between 1 and 100.");
            System.out.println(" You have " + maxAttempts + " attempts to guess it!");
            while (attempts < maxAttempts)
            {
                System.out.print("Enter your guess: ");
                int userGuess;
                if (scanner.hasNextInt()) 
                {
                    userGuess = scanner.nextInt();
                    attempts++;
                    if (userGuess == numberToGuess) 
                    {
                        System.out.println(" Correct! You guessed the number in "+ attempts +" attempts.");
                        guessedCorrectly = true;
                        roundsWon++;
                        break;
                    }
                    else if (userGuess < numberToGuess) 
                    {
                        System.out.println("low! Try again.");
                    } 
                    else
                    {
                        System.out.println("high! Try again.");
                    }
                }
                else 
                {
                    System.out.println(" Invalid input. Please enter an integer.");
                    scanner.next(); 
                }
            }
            if (!guessedCorrectly)
            {
                System.out.println(" You've used all your attempts. The number was: " + numberToGuess);
            } 
            System.out.print("\n Do you want to play another round? (yes/no): ");
            scanner.nextLine(); 
            String response = scanner.nextLine().trim().toLowerCase();
            playAgain = response.equals("yes") || response.equals("y");
        } 
        while (playAgain);
        System.out.println("\n Game Over!");
        System.out.println("Total Rounds Played: " + totalRounds);
        System.out.println("Rounds Won: " + roundsWon);
        System.out.println(" Thanks for playing!");
        scanner.close();
    }
}
