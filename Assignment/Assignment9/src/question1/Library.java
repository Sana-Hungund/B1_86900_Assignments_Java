package question1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Library {

	public static void main(String[] args) {
		Set<Book> s = new HashSet<Book>();
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
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
