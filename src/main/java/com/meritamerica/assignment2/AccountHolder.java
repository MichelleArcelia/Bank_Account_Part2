/* Week 3 Partner Pair Assignment #2
 * Bank Account Part 2  
 * @author Michelle Neptune
 * @date October 3, 2020
 * PART 1
 */


package com.meritamerica.assignment2;

import java.util.Arrays;


public class AccountHolder extends MeritAmericaBankApp {
	
// ***************** VARIABLES *****************
	
	String firstName;
	String middleName;
	String lastName;
	String ssn;
	double checkingAccountOpeningBalance;
	double savingsAccountOpeningBalance;
	
	CheckingAccount updatedChecking;
	SavingsAccount updatedSavings;
	
	
	double openingBalance = 100;
	private static double interestRate = 0.01;

// ***************** ACCOUNT HOLDER CONSTRUCTOR *****************
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		
		this.firstName = firstName;
		this.middleName = middleName; 
		this.lastName = lastName; 
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance; 
		
		updatedChecking = new CheckingAccount(checkingAccountOpeningBalance);
		
		updatedSavings = new SavingsAccount(savingsAccountOpeningBalance);
		
	} 

// ***************** GET & SET METHODS *****************
	
// ***** FIRST NAME ***** 

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

// ***** MIDDLE NAME ***** 

	public String getMiddleName() {
		return middleName;
	}
		
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

// ***** LAST NAME ***** 

	public String getLastName() {
		return lastName;
	}
		
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

// ***** SSN ***** 

	public String getSSN() {
		return ssn;
	}
		
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	
	
//***** CHECKING ACCOUNT ***** 
	
	CheckingAccount getCheckingAccount() {
		
		return updatedChecking;
	}

//***** SAVINGS ACCOUNT ***** 

		SavingsAccount getSavingsAccount() {
			
			return updatedSavings;
		}

// OUTPUT
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
 