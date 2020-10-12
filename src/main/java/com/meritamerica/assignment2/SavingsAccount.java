package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount {
	

	
	// ***************** SAVING ACCOUNT CONSTRUCTOR *****************
	
	private static final double INTEREST_RATE = 0.01; 
	
	public SavingsAccount(double openingBalance) {	
		super(openingBalance, INTEREST_RATE);
		
	}
	
}