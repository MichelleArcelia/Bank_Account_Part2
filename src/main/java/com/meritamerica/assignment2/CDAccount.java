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
	private double interestRate;
	private int term;
	private long accountNumber;
	private Date date;
	
	public CDAccount (CDOffering offering, double balance) {
		super(MeritBank.getNextAccountNUmber(),balance,offering.getInterestRate());
		//this.accountNumber = MeritBank.getnextAccountNum();
		this.offering = offering;
		//this.balance = balance;
		this.date = new Date();
		
	}
	
	public double getBalance() {
		return this.balance;
		
	}
	
	public double getinterestRate() {
		return this.interestRate;
		
		
	}
	
	public int getTerm() {
		return this.term;
		
	}
	
	public Date getStartDate() {
		//DateFormat startDate = new SimpleDateFormat ('yyyy/mm/dd HH:");
		//Date date = new date();
		return this.date;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public double futureValue() {
		return this.futureValue();
	}
	}