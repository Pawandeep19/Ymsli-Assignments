package day5.q3;

import java.util.Comparator;

public class MyComparator implements Comparator<Book> {
     public int compare(Book a,Book b) {
    	 return a.getBookTitle().compareTo(b.getBookTitle());
     }
}
