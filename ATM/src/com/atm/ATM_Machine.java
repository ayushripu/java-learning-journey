package com.atm;
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance=initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Deposited: " + amount);
        } else {
            System.out.println(" Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(" Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println(" Insufficient balance. Your balance is " + balance);
        } else {
            balance -= amount;
            System.out.println("Successfully Withdrawn: " + amount);
        }
    }

    public void checkBalance() {
        System.out.println(" Your current balance is: " + balance);
    }
}
public class ATM_Machine {
    private BankAccount account;
    private Scanner scanner;

    public ATM_Machine(BankAccount account) {
        this.account = account;
        scanner = new Scanner(System.in);
    }

    public void start() 
    {
    	int AtmPin=2389;
    	Scanner sc=new Scanner(System.in);
    	System.out.println(" 	Welcome to the ATM! 	");
    	System.out.print("Enter Your 4 Digit ATM Pin :-> ");
    	int InsertPin=sc.nextInt();
    	boolean exit = false;
    	if(AtmPin == InsertPin)
    	{
    		System.out.println("Your Atm Pin is Correct ");
	    while (!exit) 
	    {		  
	            System.out.println("\nPlease choose an option:");
	            System.out.println("1.  Check Balance");
	            System.out.println("2.  Deposit Balance");
	            System.out.println("3.  Withdraw Balance");
	            System.out.println("4.  Exit");
	            System.out.print("What do You Want to Choose: ");
	            int choice = getValidIntegerInput();
	            switch (choice) 
	            {
	                case 1:
	                    account.checkBalance();
	                    break;
	                case 2:
	                    handleDeposit();
	                    break;
	                case 3:
	                    handleWithdraw();
	                    break;
	                case 4:
	                    System.out.println(" Thank you for using the ATM!");
	                    exit = true;
	                    break;
	                default:
	                    System.out.println(" Invalid choice. Please select a valid option.");
	            }
	        }
	    }
	    else
    	{
    		System.out.println("Invalid Pin Try Algain Latter");
    	}
        scanner.close();
        sc.close();
    }
    	
    private void handleWithdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = getValidDoubleInput();
        account.withdraw(amount);
    }

    private void handleDeposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = getValidDoubleInput();
        account.deposit(amount);
    }

    private int getValidIntegerInput() {
        while (!scanner.hasNextInt()) {
            System.out.print(" Invalid input. Please enter a number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private double getValidDoubleInput() {
        while (!scanner.hasNextDouble()) {
            System.out.print(" Invalid amount. Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(5000.0);
        ATM_Machine atmMachine = new ATM_Machine(userAccount);
        atmMachine.start();
    }
}
