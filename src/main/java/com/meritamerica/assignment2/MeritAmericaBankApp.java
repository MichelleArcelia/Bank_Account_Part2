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
		
	
// *************** PROGRAM PRINT FILES ***************
				

//  ============= RUNNING TESTS ON ACCOUNT HOLDER ============= 	          
		        
	System.out.println("******************************************");
	System.out.println("   Welcome to Merit America Bank App Version 2!");
	System.out.println("    Your account details are below:");
	System.out.println("******************************************");
		
	
	
	
	AccountHolder Holder1 = new AccountHolder("Mare", "the", "cat", "123-45-6789");
	
	System.out.println(Holder1.toString());	
	
	//Holder1.updatedSavings.withdraw(20);
	
	System.out.println("NEW Savings Information: " + Holder1.updatedSavings.toString());
	
	

		
		
		
	}
}




	        