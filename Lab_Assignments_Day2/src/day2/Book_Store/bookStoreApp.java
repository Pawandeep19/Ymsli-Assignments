package day2.Book_Store;

import java.util.Scanner;

public class bookStoreApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		BookStore bs=new BookStore();
		while(true) {
		System.out.println("Menu");
		System.out.println("Enter “1”, to display the Books");
		System.out.println("Enter “2”, to order new books");
		System.out.println("Enter “3”, to sell books. ");
		System.out.println("Enter “0”, to exit the system.");
		int choice=scn.nextInt();
		if(choice==1) {
			bs.display();
		}
		else if(choice==2) {
			System.out.println("Enter the isbn of book you want to order");
			String title=scn.next();
			System.out.println("Enter the no of copies");
			int num=scn.nextInt();
			bs.order(title, num);
			bs.display();
		}
		else if(choice==3) {
			System.out.println("Enter the book title");
			String isbn=scn.next();
			System.out.println("Enter the no of copies");
			int num=scn.nextInt();
			bs.sell(isbn, num);
			bs.display();
		}
		else {
			break;
		}

	  }
	}
}
