package question2;
import java.util.Scanner;

public class CreditLimitCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.println("Enter balance of beginning of the month: ");
		int begBalance = sc.nextInt();
		
		System.out.println("total of all item charged: ");
		int totalCharged = sc.nextInt();
		
		System.out.println("total of all credit: ");
		int totalCredit = sc.nextInt();
		
		System.out.println("Enter credit limit: ");
		int creditLimit = sc.nextInt();
		
		int newBalance = begBalance + totalCharged - totalCredit;
		System.out.println("for account number " + accountNumber +" " +"new balance is " + newBalance );
		
		if (newBalance > creditLimit) {
			System.out.println("Credit limit exceeded");
		}else {
			System.out.println("credit limit not exceeded.");
		}
		
		

	}

}
