package question3;

import java.util.Scanner;

public class DuplicateFinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the first array: ");
		int size1 = scanner.nextInt();
		
		String[] array1 = new String[size1];
        System.out.println("Enter elements for the first array:");

		
		for (int i = 0; i < size1; i++) {
			array1[i] = scanner.nextLine();
		}
		
		System.out.println("Enter the size of the second array: ");
		int size2 = scanner.nextInt();
		String[] array2 = new String[size2];
        System.out.println("Enter elements for the second array:");

		for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextLine();
        }
		
		System.out.println("Duplicate values between both arrays:");
		for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                    
                }
            }
		}    
	}

}
