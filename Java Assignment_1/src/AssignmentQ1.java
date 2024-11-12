import java.util.Scanner;

public class AssignmentQ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		String binary_num = Integer.toBinaryString(number);
		String hex_num = Integer.toHexString(number);
		String oct_num = Integer.toOctalString(number);
		
		System.out.println("The Given number is "+ number);
		System.out.println("Binary Equivalent : "+binary_num+ "\n"+ "Octal equivalent :"+oct_num+ "\n"+ "Hexadecimal equivalent : "+hex_num);
		
	}

}
