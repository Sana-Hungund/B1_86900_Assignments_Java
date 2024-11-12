import java.util.Scanner;

public class AssignmentQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		String n1 = sc.next();
		String n2 = sc.next();
		
		try {
			Double d1 = Double.valueOf(n1);
			Double d2 = Double.valueOf(n2);
			System.out.println("Average of the 2 numbers = "+(d1+d2)/2);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Entered incorrect values, please enter correct Double values ");
		}
		
		
	}

}
