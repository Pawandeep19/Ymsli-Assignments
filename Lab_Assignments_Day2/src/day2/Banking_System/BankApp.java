package day2.Banking_System;

import java.util.Scanner;

import day2.Book_Store.BookStore;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name=scn.next();
		System.out.println("Enter 1 for opening Saving Account");
		System.out.println("Enter 2 for opening Current Account");
		int c=scn.nextInt();
		Account account;
		if(c==1) {
			account=new SavingsAccount(name);
		}
		else {
			account=new CurrentAccount(name);
		}
		while(true) {
			System.out.println("Menu");
			System.out.println("Enter “1”, to Deposit Money");
			System.out.println("Enter “2”, to withdraw Money");
			System.out.println("Enter “3”, to display account balance");
			System.out.println("Enter “0”, to exit the system.");
			int choice=scn.nextInt();
			if(choice==1) {
				System.out.println("Enter The Amount you want to add");
				double amount=scn.nextDouble();
				account.deposit(amount);
			}
			else if(choice==2) {
				System.out.println("Enter The Amount you want to withdraw");
				double amount=scn.nextDouble();
				account.withdraw(amount);
			}
			else if(choice==3) {
				account.getBalance();
			}
			else {
				break;
			}

	   }

	}

}
