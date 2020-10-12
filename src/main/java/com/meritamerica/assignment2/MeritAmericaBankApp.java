/* Week 3 Partner Pair Assignment #2
 * Bank Account Part 2  
 * @author Michelle Neptune
 * @date October 10, 2020
 * PART 2
 */


package com.meritamerica.assignment2;

//import com.meritamerica.assignment1.AccountHolder;

public class MeritAmericaBankApp {
	
	public static void main(String[] args) {
		
      
		        
	System.out.println("******************************************");
	System.out.println("   Welcome to Merit America Bank App Version 2!");
	System.out.println("    Your account details are below:");
	System.out.println("******************************************");

//Set CD Offerings
	
	CDOffering[] CDOfferings = new CDOffering[5];
		CDOffering[0] = new CDOffering(1, .018);
		CDOffering[1] = new CDOffering(2, .019);
		CDOffering[2] = new CDOffering(3, .020);
		CDOffering[3] = new CDOffering(5, .025);
		CDOffering[4] = new CDOffering(10, .022);
	
	
	MeritBank.setCDOfferings(CDOfferings);
	
// USER 1	
	
	AccountHolder ah1 = new AccountHolder("Mare", "the", "cat", "123-45-6789");
	
		ah1.addCheckingAccount(1000);
		ah1.addSavingsAccount(10000);
		
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount(50000);
		
		ah1.addCheckingAccount(50000);
		ah1.addSavingsAccount(500000);
		
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount(50000);
		
		
		ah1.addCDAccount(MeritBank.getBestCDOffering(1000), 1000);
		
		System.out.println("TESTING - CD TERMS: " + ah1.getCDAccounts()[0].getTerm());
		
		MeritBank.addAccountHolder(ah1);
	
	
// USER 2 
		
		
	

		
		
	}
}




	        