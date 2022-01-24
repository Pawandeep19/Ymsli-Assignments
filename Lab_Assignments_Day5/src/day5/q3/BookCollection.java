package day5.q3;

import java.util.Arrays;

public class BookCollection {

	private String ownerName;
	private Book[] books;
	
	public BookCollection(String ownerName,Book[] books) {
		this.ownerName=ownerName;
		this.books=books;
	}

	@Override
	public String toString() {
		String str="";
		
		for(Book b:books) {
			str+=b.toString();
		}
		return str;
	}
	
	public boolean hasBook(Book b) {
		String bookTitle=b.getBookTitle();
		String bookAuthor=b.getBookAuthor();
		
		for(Book book:books) {
			if(book.getBookAuthor().contentEquals(bookAuthor) && book.getBookTitle().contentEquals(bookTitle)) {
				return true;
			}
		}
		return false;
	}

	public void sort(MyComparator myComparator) {
		Arrays.sort(books,new MyComparator());
		
		
	}
  

}
