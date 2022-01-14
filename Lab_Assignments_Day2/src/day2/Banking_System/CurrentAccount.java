package day2.Banking_System;

public class CurrentAccount extends Account {
	String tradeLicenseNumber;
	CurrentAccount(String memberName) {
		super(memberName);
		tradeLicenseNumber=accountNumber;
	}
	//overriding Account functions getBalance according to Current Account 
	public void getBalance() {
 	       System.out.println(balance);
    }
    //overriding Account function
	void withdraw(double amount) {		
 		   if(balance-amount>2000) {
 			   balance=balance-amount;
 			  System.out.println("Money Deducted");
 		   }
 		   else {
 			   System.out.println("Not enough Money in the account");
 		   } 	  
	}	

}
