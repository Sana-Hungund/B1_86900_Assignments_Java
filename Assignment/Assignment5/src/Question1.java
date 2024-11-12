import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  string: ");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		System.out.println("reverse string : " + sb.reverse());
		
	}

}
