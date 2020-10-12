package com.meritamerica.assignment2;
/* Week 3 Partner Pair Assignment #2
 * Bank Account Part 2  
 * @author Allana Gray
 * @date October 9, 2020
 * PART 2
 */

import java.util.Date;

public class CDAccount extends BankAccount {

	CDOffering offering;
	private double balance;
	private Date date;

	public CDAccount(CDOffering offering, double balance) {
		super(MeritBank.getNextAccountNUmber(), balance, offering.getInterestRate());
		this.offering = offering;
		this.date = new Date();
	}

	public double getBalance() {
		return super.getBalance();
	}

	public double getinterestRate() {
		return offering.getInterestRate();
	}

	public int getTerm() {
		return offering.getTerm();
	}

	public Date getStartDate() {
		return this.date;
	}

	public long getAccountNumber() {
		return super.getAccountNumber();
	}

	public double futureValue() {
		return (balance * Math.pow(1.0 + offering.getInterestRate(), offering.getTerm()));
	}
}