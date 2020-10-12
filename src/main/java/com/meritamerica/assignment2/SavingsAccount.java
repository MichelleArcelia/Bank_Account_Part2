package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount {
	

	
	// ***************** SAVING ACCOUNT CONSTRUCTOR *****************
	
	public SavingsAccount(double openingBalance) {	
		super(openingBalance);
		
	}
	
}
	
	



















/*	
	
	
	// ***************** VARIABLES ***************** 
		public double interestRate;
		public double openingBalance;
		public double futureValue;
		private long accountNumber;
			

	// ***************** SAVING ACCOUNT CONSTRUCTOR *****************
			
		public SavingsAccount(double openingBalance) {	
			this.openingBalance = openingBalance; 
			this.interestRate =0.01;
			this.accountNumber = MeritBank.getNextAccountNUmber();
			
		}
			
		// ***************** GET METHODS *****************

			
		// Balance
			
			public double getBalance() {
				return this.openingBalance;
			}
			
			//Interest Rate
			public double getInterestRate() {
				return this.interestRate;
			}
				
		
			

		// Withdraw
			
			public boolean withdraw (double amount) {
				
			if ( amount < openingBalance && amount > 0) {
			openingBalance -= amount;
			return true;
			}else {
			System.out.println ("Not enough money!");
			return false;
					}
				}
		
				
			
		// Deposit
			
			public boolean deposit(double amount) {
				if (amount > 0) {
					openingBalance += amount;
					return true;
				}else {
					System.out.println("Cannot deposit a negative amount");
					return false;
				}
					}
			

			// public double futureValue(int years) {
			public  double futureValue(int years) {
				double FV = openingBalance * Math.pow(1.0 + interestRate,years);
				return FV;
			}
			
			
		// =======  STRING TO STRING - OUTPUT TP BANK APP======= 
			
			public String toString() {

					
				return ("\n After your transaction here is your Checking Account in Detail: \n" +
						"\n Savings Account Balance: " + getBalance()+
						"\n Savings Account Interest Rate:" + getInterestRate()+
						"\n Savings Account Balance in 3 years:" + futureValue(3)); 
						

		}
	}
	*/		