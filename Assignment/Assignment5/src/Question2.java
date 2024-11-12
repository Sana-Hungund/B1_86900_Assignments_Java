import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scanner.nextLine();
		StringBuffer sb = new StringBuffer(str);
		String reverse = sb.reverse().toString();
		if (str.equals(reverse)) {
			System.out.println("The string is a pallindrome");
			
		}else {
			System.out.println("THe string is not Pallindrome");
		}
	}

}
