package question1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class question3 {
	
	public static void main(String[] args) {
		class PublishDateComparator implements Comparator<Book> {
		    @Override
		    public int compare(Book b1, Book b2) {
		        return b1.getPublishDate().compareTo(b2.getPublishDate());
		    }
		}

		Set<Book> s = new TreeSet<Book>(new PublishDateComparator());
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter isbn");
			String isbn = scanner.next();
			System.out.println("Enter price");
			double price = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Enter Date");
			String publishDate = scanner.nextLine();
			System.out.println("Enter author name");
			String authorName = scanner.nextLine();
			System.out.println("Enter Quantity");
			int quantity = scanner.nextInt();
			scanner.nextLine();
		    Book book = new Book(isbn, price, publishDate, authorName, quantity);
		    s.add(book);
		  
		    
		}
		
		for (Book book : s) {
			System.out.println(book);
			
		}

	}

}
