package question1;

import java.util.Objects;

public class Book implements Comparable<Book>{
	enum Category {
		SCIENCE, HISTORY,TECHNOLOGY;
	}
	private String isbn;
	private double price;
	private String publishDate;
	private String authorName;
	private int quantity;
	public Book(String isbn,double price, String publishDate, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	public String getPublishDate() {
		return publishDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}
	

	@Override
	public int compareTo(Book o) {
        return this.publishDate.compareTo(o.publishDate);

		
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", publishDate=" + publishDate + ", authorName=" + authorName
				+ ", quantity=" + quantity + "]";
	}
	
	
	
	

}
