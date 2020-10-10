package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount {

	
    // iINSTANCE VARIABLES
	public double interestRate;
	public double openingBalance;
	public double futureValue;
	
	
    //CONSTRUCTOR OF OBJECTS CLASS CHECKING
	
	public CheckingAccount(double openingBalance) {
		this.openingBalance = openingBalance;
	}
		
	

	//BALANCE
	public double getBalance() {
		return this.openingBalance;
	}
	
	
	//INTEREST RATE
	public double getInterestRate() {
		return this.interestRate;
		 	
		
	}
	

    //WITHDRAW
	public boolean withdraw (double amount) {
		if ( amount < openingBalance && amount > 0) {
			openingBalance -= amount;
			return true;
		}else {
			System.out.println ("Not enough money!");
			return false;
		}
	}
	
	
	 
	//DEPOSIT
	public boolean deposit(double amount) {
	if (amount > 0) {
		openingBalance += amount;
		return true;
	}else {
		System.out.println("Cannot deposit a negative amount");
		return false;
	}
		}
	
		
		
	
	// FUTURE VALUE
	public  double futureValue(int years) {
		double FV = openingBalance * Math.pow(1 + interestRate,years);
		return FV;
		
		
	}
		
	//STRING TO STRING OUTPUT
	public String toString() {
		
	return ("\n After your transaction here is your Checking Account in Detail: \n" +
				"\n Checking Account Balance: " + getBalance()+
				"\n Checking Account Interest Rate:" + getInterestRate()+
				"\n Checking Account Balance in 3 years:" + futureValue(3)); 
				
	
	}
	
}
	
