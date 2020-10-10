package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount {
	
	public CDOffering offering = new CDOffering();
	public int term;
	public Date startDate = new Date ();
	
	
	CDAccount(CDOffering offering, double balance){
	this.offering = offering;
	this.balance = balance;
	
	}
	
	public double getBalance() {
		return  this.balance;
	}
	public double getInterestRate() {
		return this.interestRate;
		
	}
	public int getTerm() {
		return this.term;
		
	}
	public java.util.Date getStartDate() {
		return this.startDate;
		
	}
	public long GetAccountNumber() {
		return this.accountNumber;
		
	}
	
	double futureValue() {
		double FV = balance * Math.pow(1.0 + interestRate,years);
		return FV;
	
	}
}

