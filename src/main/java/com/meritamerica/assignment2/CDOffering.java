package com.meritamerica.assignment2;

public class CDOffering {

	int term;
	double interestRate;
	
	CDOffering(){
	}
	
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
