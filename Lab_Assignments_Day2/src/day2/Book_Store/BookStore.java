package day2.Book_Store;

import java.util.Scanner;

public class BookStore extends Book {
	Scanner scn=new Scanner(System.in);
	private Book[] books=new Book[10];	;
	private int size=0;
	BookStore(String bookTitle, String author, String ISBN, int numOfCopies) {
		super(bookTitle, author, ISBN, numOfCopies);
	}
	
    public BookStore() {
		for(int i=0;i<10;i++) {
			this.books[i]=new Book();
		}
	}

	boolean flag1=false;
    public void sell(String bookTitle, int noOfCopies) {
    	for(int i=0;i<size;i++) {
    		if(bookTitle.contentEquals(books[i].bookTitle)) {
    			if(noOfCopies<=books[i].numOfCopies) {
    				books[i].numOfCopies-=noOfCopies;
    			}
    			else {
    				System.out.println("Not Available to sell");
    			}
    			flag=true;
    		}
    	}
    	if(!flag) {
    		System.out.println("Not Available to sell");
    	}
    }
    boolean flag=false;
    public void order(String isbn, int numOfCopies) {
    	for(int i=0;i<size;i++) {
    		if(isbn.contentEquals(books[i].ISBN)) {
    			books[i].numOfCopies+=numOfCopies;
    			flag=true;
    		}
    	}
    	if(!flag) {
    		//new book
    		System.out.println("Enter the title of the book");
    		String Title=scn.next();
    		System.out.println("Enter the Author");
    		String Author=scn.next();
    		Book newBook=new Book(Title,Author,isbn,numOfCopies);
    		books[size]=newBook;
    		size++;
    	}
    }
    public void display() {
    	for(int i=0;i<size;i++) {
    		books[i].display();
    	}
    	if(size==0) {
    		System.out.println("No books To display");
    	}
    	
    }
}
