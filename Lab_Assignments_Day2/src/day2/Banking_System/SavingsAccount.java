package day2.Banking_System;

public class SavingsAccount extends Account {
	   private double interest=5;
       double maxLimit=10000;
       SavingsAccount(String memberName) {
		   super(memberName);
		
	   }
     //overriding Account functions getBalance according to Savings Account 
       public void getBalance() {
    	   double totalInterest=balance*((interest/100));
    	   System.out.println((totalInterest+balance));
       }
       //overriding Account function
       void withdraw(double amount) {
    	   if(amount<maxLimit) {
    		   if(balance-amount>2000) {
    			   balance=balance-amount;
    			   System.out.println("Money Deducted");
    		   }
    		   else {
    			   System.out.println("Not enough Money in the account");
    		   }
    	   }
    	   else {
    		   System.out.println("Exceeded the max withdraw limit");
    	   }
       }
       
}
