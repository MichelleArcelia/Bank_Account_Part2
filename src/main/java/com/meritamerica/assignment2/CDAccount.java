package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount {
	
	public CDOffering offering = new CDOffering();
	public int term;
	public Date startDate = new Date ();
	
	CDOfferings[0] = new CDOffering (1,1.8/100);
	CDOfferings[1] = new CDOffering (2,1.9/100);
	CDOfferings[2] = new CDOffering (3,2.0/100);
	CDOfferings[3] = new CDOffering (5,2.5/100);
	CDOfferings[4] = new CDOffering (10,2.2/100);

	
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

