/* Week 3 Partner Pair Assignment #2
 * Bank Account Part 2  
 * @author Michelle Neptune
 * @date October 10, 2020
 * PART 2
 */


package com.meritamerica.assignment2;

import java.util.Arrays;

//import com.meritamerica.assignment1.CheckingAccount;
//import com.meritamerica.assignment1.SavingsAccount;


public class AccountHolder extends MeritAmericaBankApp {
	
// ***************** VARIABLES *****************
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	double checkingAccountOpeningBalance;
	double savingsAccountOpeningBalance;
	
	CheckingAccount updatedChecking;
	SavingsAccount updatedSavings;
	
	
	private int checkingAccountNumber = 0;
	private int savingsAccountNumber = 0;
	private int cdAccountNumber = 0;
	
	
	double openingBalance = 100;
	private static double interestRate = 0.01;
	
	
	
	
	this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
	this.savingsAccountOpeningBalance = savingsAccountOpeningBalance; 
	
	updatedChecking = new CheckingAccount(checkingAccountOpeningBalance);
	
	updatedSavings = new SavingsAccount(savingsAccountOpeningBalance);
	
	
	
	
	

// ***************** ACCOUNT HOLDER CONSTRUCTOR *****************
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn) {
		
		this.firstName = firstName;
		this.middleName = middleName; 
		this.lastName = lastName; 
		this.ssn = ssn;

	} 
	
// ***************** GET & SET METHODS *****************
	
	
// ===== FIRST NAME ===== 

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

// ===== MIDDLE NAME ===== 

	public String getMiddleName() {
		return middleName;
	}
		
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

// ===== LAST NAME ===== 

	public String getLastName() {
		return lastName;
	}
		
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

// ===== SSN ===== 

	public String getSSN() {
		return ssn;
	}
		
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	
	
// ===== CHECKING ACCOUNT METHODS===== 
	
	
	public CheckingAccount addCheckingAccount(double openingBalance) {
		
		double totalBalance = 0;
		double totalChecking = 0;
		double totalSaving = 0;
		double testingAdd = openingBalance;
		
		totalChecking = this.getCheckingBalance();
		totalSaving = this.getSavingsBalance();
		totalBalance = this.getCheckingBalance();
		
		totalBalance = totalChecking + totalSaving + testingAdd;
		
		if(totalBalance > 250000) {
			System.out.println("WARNING! New accounts can not be opened until the combined balances of your current accounts are below $250,000.");
			return checking[checkingAccountNumber];
		
		}
		else {
			checking[checkingAccountNumber] = new CheckingAccount(openingBalance);
			//??????????????????
			return checking[checkingAccountNumber - 1];
		}
	}
	
	
		
		
		
		
		
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
	}
	
	
	CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		//????????????????
	}
	
	
	public CheckingAccount[] getCheckingAccounts() {
		
		return this.checking;
	}
	
	
	public int getNumberOfCheckingAccounts() {
		return this.checkingAccountNum;
	}
	
	
	double getCheckingBalance() {
		double totalBalance = 0;
		for(int x=0; x < checkingAccountNumber; x++) {
			totalBalance = totalBalance + checking[x].getBalance();
		}
		return totalBalance;
	}


// ===== SAVINGS ACCOUNT ===== 
	
	
	
	SavingsAccount addSavingsAccount(double openingBalance) {
		
	}
	
	
	SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		
		
	}
	
	
	
	SavingsAccount getSavingsAccount() {
		
		return updatedSavings;
	}
	
	
	
	int getNumberOfSavingsAccounts() {
		
	}
	
	
	double getSavingsBalance() {
		
		
	}

	
// ===== CD ACCOUNT ===== 	
	
	CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		
		
	}
	
	
	CDAccount addCDAccount(CDAccount cdAccount) {
		
		
	}
	
	
	CDAccount[] getCDAccounts() {
		
		
	}
	
	
	int getNumberOfCDAccounts() {
		
		
	}
	
	
	double getCDBalance() {
		
		
	}
	
	
	double getCombinedBalance() {
		
		
	}

	
	
	
	



// ***************** OUTPUT *****************
		
	public String toString() {

		return ("\n Name: " + firstName + " " + middleName + " " + lastName + 
		"\n SSN:" + getSSN() +
		"\n Checking Account Balance: " + openingBalance +
		"\n Checking Account Interest Rate: " + interestRate +
		"\n Checking Account Balance in 3 years: ?????????????? \n" + 
		"\n" + updatedSavings.toString() );
		//"\n" + updatedChecking.toString()); 
		
		

	}

}








//this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
//this.savingsAccountOpeningBalance = savingsAccountOpeningBalance; 

//updatedChecking = new CheckingAccount(checkingAccountOpeningBalance);

//updatedSavings = new SavingsAccount(savingsAccountOpeningBalance);
 