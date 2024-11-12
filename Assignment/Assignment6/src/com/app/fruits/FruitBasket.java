package com.app.fruits;

import java.util.Scanner;


public class FruitBasket {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of basket: ");
		int size = scanner.nextInt();
		Fruits[] basket  = new Fruits[size];
		
		int counter = 0;
		while (true) {
			System.out.println("--welcome---");
			System.out.println("1. add mango ");
			System.out.println("2. add Orange");
			System.out.println("3. add Apple");
			System.out.println("4. Display names of all fruits in the basket.");
			System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket");
			System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
			System.out.println("7. Mark all sour fruits stale");
			System.out.println("10. EXIST");
			
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				if (counter == size) {
					System.out.println("basket is full");
					
				} else {
					System.out.println("Enter mango name, mango color, mango weight: ");
					String mango_name = scanner.next();
					String mango_color = scanner.next();
					double weight = scanner.nextDouble();
					basket[counter++] = new Mango(mango_color, weight, mango_name);
					

				}
				
				break;
			case 2:
				if (counter == size) {
					System.out.println("basket is full");
					
				} else {
					System.out.println("Enter Orange name, orange color, orange weight");
					String OrangeName = scanner.next();
					String OrangeColor = scanner.next();
					double OrangeWeight = scanner.nextDouble();
					basket[counter++] = new Orange(OrangeColor, OrangeWeight, OrangeName);
				}
				break;
			case 3:
				if (counter == size) {
					System.out.println("basket is full");
					
				} else {
					System.out.println("Enter Apple name, Apple color, Apple weight");
					String appleName = scanner.next();
					String appleColor = scanner.next();
					double appleWeight = scanner.nextInt();
					basket[counter++] = new Apple(appleColor, appleWeight, appleName);
				}
				break;
			case 4:
				System.out.println("All the fruits in the basket: ");
				for (Fruits fruit : basket) {
					if (fruit != null) {
						System.out.println(fruit.getName());
					}
				}
				break;
			case 5:
				System.out.println("details of all fresh fruits: ");
				for (Fruits fruit : basket) {
					if (fruit != null && fruit.isFresh()) {
						System.out.println(fruit + ": Taste " + fruit.taste());
						
					} 
					
				}
				break;
			case 6:
				System.out.println("Enter fruit index to mark as stale");
				int index = scanner.nextInt();
				if (index > 0 && index < basket.length) {
					basket[index].setFresh(false);
					System.out.println(basket[index].getName() + "marked as a stale");
					
				} else {
					System.out.println("invalid index");

				}
				break;
			case 7:
				System.out.println("Marking all sour fruits as a stale ");
				for (Fruits fruit : basket) {
					if (fruit != null && fruit.taste().equals("sour")) {
						fruit.setFresh(false);
						
					}
					
				}
				break;
			case 10:
				System.out.println("Exit the program");
				return;

			default:
				System.out.println("invalid choice");
				break;
			}
	
			
		}

	}

}
