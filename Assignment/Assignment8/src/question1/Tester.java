package question1;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Stack stack = null;
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1. Chosen Fixed Stack");
			System.out.println("2. Chosen Growable Stack");
			System.out.println("3. Push Data");
			System.out.println("4. Pop Data");
			System.out.println("5. Exist");
			
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				if (stack == null) {
					stack = new FixedStack();
					System.out.println("fixed stack chosen");
					
				} else {
					System.out.println("Stack already chosen.");
				}
				
				break;
			case 2:
				if (stack == null) {
					stack = new GrowableStack();
					System.out.println("Growable stack chosen");
					
				} else {
					 System.out.println("Stack already chosen.");

				}
				break;
			case 3:
				if (stack !=  null) {
					System.out.println("Enter employee id ,name and Salary");
					System.out.println("Enter employee id");
					int id = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter employee name");
					String name = scanner.nextLine();
					System.out.println("Enter employee salary");
					double salary = scanner.nextDouble();
					scanner.nextLine();
					
					Employee emp = new Employee(id, name, salary);
					stack.push(emp);
					
					
				} else {
					System.out.println("no stack chosen");

				}
				
				break;
			case 4:
				if (stack != null) {
					Employee emp = stack.pop();
					if (emp != null) {
						System.out.println("employee popped " + emp);
						
					}
					
				} else {
					System.out.println("no stack chosen");

				}
				break;
			case 5:
				System.out.println("exist the program");
				return;
				

			default:
				System.out.println("Invalid choice");
				
			}
			
		}

	}

}
