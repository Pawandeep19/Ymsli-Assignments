package day5.q3;

public class Book {
	private String bookTitle;
	private String bookAuthor;
	
	public Book(String bookTitle, String bookAuthor) {
		
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	
	@Override
	public String toString() {
		return "Book [title=" + bookTitle + ", author=" + bookAuthor + "] \n";
	}
}
