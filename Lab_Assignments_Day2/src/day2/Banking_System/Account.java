package day2.Banking_System;

abstract class Account {
    protected String memberName;
    protected String accountNumber;
    protected Double balance;
    Account(String memberName){
    	this.memberName=memberName;
    	this.balance=0.0;
    	accountNumber=10000 + (int)(Math.random()*89999) + "";
    }
    public void deposit(double money) {
    	this.balance+=money;
    	System.out.println("Money Deposited");
    }
    
    abstract void getBalance();
    abstract void withdraw(double amount);
}
