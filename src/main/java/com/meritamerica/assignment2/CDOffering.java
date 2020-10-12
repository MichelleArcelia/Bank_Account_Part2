package com.meritamerica.assignment2;

/* Week 3 Partner Pair Assignment #2
 * Bank Account Part 2  
 * @author Allana Gray
 * @date October 9, 2020
 * PART 2
 */

public class CDOffering {

	int term;
	double interestRate;
	

	
	// Constructor
	CDOffering (int term, double interestRate) {
	this.term = term;
	this.interestRate = interestRate;
	}
		
	
	public int getTerm() {
	return term;
		
	}
	public double getInterestRate() {
		
	return interestRate;
		
	}
		
	
	}
