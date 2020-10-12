package com.meritamerica.assignment2;

public class BankAccount {

	/* Week 3 Partner Pair Assignment #2
	 * Bank Account Part 2  
	 * @author Allana Gray
	 * @date October 9, 2020
	 * PART 2
	 */
	
	// instance variable
		private long accountNumber;
		private double balance;
		private double interestRate;
		double bankAccount;

		
	//Constructs a Bank Account 
		  
	public BankAccount(double balance, double interestRate){
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountNumber = MeritBank.getNextAccountNUmber();
	}
		

		
		   
	
	public BankAccount(long accountNumber, double balance, double interestRate){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
		
		
		
	}
	//Account Number
	 public long getAccountNumber() {
		 return this.accountNumber;
		
		
	}

	 //Balance
	public double getBalance() {
		return this.balance;
		
	}

	//Interest Rate
	public double getInterestRate() {
		return interestRate;
		
	}


	//Withdraw
	public boolean Withdraw (double amount) {

	    if (amount < balance && amount > 0) {
	       balance -= amount;
	       return true;
	    }else {
	    	System.out.println ("not enough money in your account!");
	    	return false;
	    }
	}

	// Deposit
	public boolean Deposit (double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		}else {
			System.out.println("Cannot deposit a negative amount");
			return false;
		}
		
	}
	//Future Value
	public double futureValue(int years) {
		double FV = balance * Math.pow(1.0 + interestRate,years);
		return FV;

	}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	