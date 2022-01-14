package day2.Book_Store;

public class Book {
     protected String bookTitle;
     protected String author;
     protected String ISBN;
     protected int numOfCopies;
     Book(String bookTitle, String author, String ISBN,int numOfCopies){
    	 this.bookTitle=bookTitle;
    	 this.author=author;
    	 this.ISBN=ISBN;
    	 this.numOfCopies=numOfCopies;
     }
     Book(){
     }
	public void display() {
    	 System.out.println(bookTitle+" - "+author+" - "+ISBN+" - "+numOfCopies);
     }     
}
