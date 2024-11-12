import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = scanner.nextLine().trim();
		
		String[] words = str.split(" ");
		System.out.println("No of words in a string is : " + words.length);

	}

}
