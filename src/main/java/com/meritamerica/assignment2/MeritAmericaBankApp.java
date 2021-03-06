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
		
      
		        


//Set CD Offerings
	
	CDOffering[] CDOffering = new CDOffering[5];
		CDOffering[0] = new CDOffering(1, .018);
		CDOffering[1] = new CDOffering(2, .019);
		CDOffering[2] = new CDOffering(3, .020);
		CDOffering[3] = new CDOffering(5, .025);
		CDOffering[4] = new CDOffering(10, .022);
	
	
	MeritBank.setCDOfferings(CDOffering);
	
// USER 1	
	
	
	
	
	
	
	System.out.println("******************************************");
	System.out.println("   Welcome to Merit America Bank App Version 2!");
	System.out.println("    Your account details are below:");
	System.out.println("******************************************");
	
	
	AccountHolder ah1 = new AccountHolder("Mare", "the", "Cat", "123-45-6789");
	
		System.out.println("");
		System.out.println("======= ACCOUNT HOLDER: " + ah1.getFirstName() + " " + ah1.getLastName()  + " ======= ");
		System.out.println("");
		
		ah1.addCheckingAccount(1000);
		ah1.addSavingsAccount(10000);
		System.out.println("");
		
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount(50000);
		System.out.println("");
		
		ah1.addCheckingAccount(50000);
		ah1.addSavingsAccount(500000);
		System.out.println("");
		
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount(50000);
		System.out.println("");
		
		ah1.addCDAccount(MeritBank.getBestCDOffering(1000), 1000);
		
		
		
		System.out.println("CD TERM: " + ah1.getCDAccounts()[0].getTerm());
		
		MeritBank.addAccountHolder(ah1);
	
	
// USER 2 
		
		AccountHolder ah2 = new AccountHolder("Luna", "the", "Cat", "122-33-5555");
		
		System.out.println("");
		System.out.println("======= ACCOUNT HOLDER: " + ah2.getFirstName() + " " + ah2.getLastName() + " ======= ");
		System.out.println("");
		
		
			ah2.addCheckingAccount(1000);
			ah2.addSavingsAccount(10000);
			
			ah2.addCDAccount(MeritBank.getSecondBestCDOffering(1000), 1000);
			
			
			System.out.println("CD TERMS: " + ah2.getCDAccounts()[0].getTerm());
			
			MeritBank.addAccountHolder(ah2);
			
			
// Clear the CD Offerings
			
			MeritBank.clearCDOfferings();
			
			
// USER 3 
			
			AccountHolder ah3 = new AccountHolder("Patches", "the", "Dog", "989-34-8888"); 
			
			
			
			System.out.println("");
			System.out.println("======= ACCOUNT HOLDER: " + ah3.getFirstName() + " " + ah3.getLastName() + " ======= ");
			System.out.println("");
			
			ah3.addCDAccount(MeritBank.getSecondBestCDOffering(1000), 1000);
			
			System.out.println("TESTING " + ah3.getCDAccounts().length);
			
			ah3.addCheckingAccount(1000);
			ah3.addSavingsAccount(10000);
			
			MeritBank.addAccountHolder(ah3);
			
// TOTAL balance of all accounts held by Merit Bank’s account holders 
			
			System.out.println("TOTAL ACCOUNT BALANCES HELD BY MERIT BANK HOLDERS:" + MeritBank.totalBalance());
				
	}
}




	        