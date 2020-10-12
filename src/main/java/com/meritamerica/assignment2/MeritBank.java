/* Week 3 Partner Pair Assignment #2
 * Bank Account Part 2  
 * @author Allana Gray
 * @date October 12, 2020
 * PART 2
 */
package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	
	private static AccountHolder[] accounts = new AccountHolder [1];
	private static AccountHolder accountHolder;
	private static CDOffering[] cdofferings;
	private static CDOffering bestCDOffering;
	private static CDOffering secondBestCDOffering;
	private double depositAmount;
	private static long nextAccountNumber = 00000001;
	
	static void addAccountHolder(AccountHolder accountHolder) {
		
	//New logic 
		AccountHolder [] newaccounts = new AccountHolder [accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
		newaccounts[i] = accounts[i];
	}
		
		accounts = newaccounts;
		accounts[accounts.length-1] = accountHolder;
	}
	
	static AccountHolder[] getAccountHolders() {
		return accounts;
		
	}
	static CDOffering[] getCDOfferings() {
		return cdofferings;
		
		
	}
	
	static CDOffering getBestCDOffering (double depositAmount) {
		double value=0;
		CDOffering currentOffer = null;
		if (cdofferings == null) {
			return null;
			
		}
		for (int i = 0; i < cdofferings.length; i++) {
			if(futureValue(depositAmount,cdofferings[i].getInterestRate(), cdofferings[i].getTerm())
					> value) {
				value = futureValue(depositAmount,cdofferings[i].getInterestRate(), cdofferings[i].getTerm());
				currentOffer = cdofferings[i];
				
			}
		}
		return currentOffer;
	}
	static CDOffering getSecondBestCDOffering(double depositAmount) {
		double value = 0;
		CDOffering currentOffer = null;
		CDOffering highestOffer = null;
		if(cdofferings == null) {
			return null;
		}
		for (int i = 0; i < cdofferings.length; i++) {
			if(futureValue(depositAmount, cdofferings[i].getInterestRate(), cdofferings[i].getTerm())
					> value) {
				value = futureValue (depositAmount,cdofferings[i].getInterestRate(),cdofferings[i].getTerm());
				currentOffer = highestOffer;
				highestOffer = cdofferings[i];
				
			}
		}
		
		return currentOffer;
		
	}
	
	static void clearCDOffering() {
		cdofferings = null;
		
	}
	
	static void setCDOfferings(CDOffering[] offerings) {
		cdofferings = offerings;
		
	}
	
	static long getNextAccountNUmber() {
		long acctNum = nextAccountNumber;
		nextAccountNumber++;
		return acctNum;
		
	}
	static double totalBalance() {
		double allBalances = 0;
		for(int i = 0; i< accounts.length; i++) {
			allBalances += accounts[i].getCombinedBalance();
			
		}
		
		return allBalances;
	}
	static double futureValue(double presentVAlue, double interestRate, int term) {
		double futureValue = Math.pow(1 + interestRate, term);
		return futureValue;
	}
}
		
		