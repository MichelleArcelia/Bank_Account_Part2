package com.meritamerica.assignment2;

/* Week 3 Partner Pair Assignment #2
 * Bank Account Part 2  
 * @author Allana Gray
 * @date October 9, 2020
 * PART 2
 */
public class CheckingAccount extends BankAccount {
	
	private static final double INTEREST_RATE = 0.0001; 
	
    //CONSTRUCTOR OF OBJECTS CLASS CHECKING
	
	public CheckingAccount(double openingBalance) {
		super(openingBalance, INTEREST_RATE);
	}
	
	
	
}
