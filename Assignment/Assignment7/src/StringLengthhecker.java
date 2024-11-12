import java.util.Scanner;

class ExceptionLineTooLong extends Exception {

	public ExceptionLineTooLong() {
		super("the string is too long");
	}

}

public class StringLengthhecker {
	public static void checkStringLength(String userString) throws ExceptionLineTooLong{
		if (userString.length() > 80) {
			throw new ExceptionLineTooLong();
		} else {
			System.out.println("the string is within limit");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String userINput = scanner.nextLine();
		
		try {
			checkStringLength(userINput);
			
		} catch (ExceptionLineTooLong e) {
			System.out.println(e.getMessage());
		}
		

	}

}
