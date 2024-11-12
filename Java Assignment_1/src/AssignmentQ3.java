import java.util.Scanner;

public class AssignmentQ3 {
	static double total_cost = 0;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("Select the food item ");
		System.out.println("1. Dosa "+"\t"+"Price  = 70 "+"\n"+ "2. Samosa" +"\t"+"Price  = 15 "+"\n"+"3. Idli " +"\t"+"Price  = 30 "+"\n"+ "4. Vada Pav "+"\t"+"Price  = 15 "+"\n"+ "5. Pakoda "+"\t"+"Price  = 20 "+"\n"+ "6. Pav Bhaji "+"\t"+"Price  = 60 "+"\n"+ "7. Paratha "+"\t"+"Price  = 50 "+"\n"+ "8. Tea "+"\t\t"+"Price  = 10 "+"\n"+ "9. Coffee "+"\t"+"Price  = 15 "+"\n"+ "10. Generate Bill" );
		int item = sc.nextInt();
		
	
		switch (item) {
		case 1: {
			System.out.println("Enter Quantity : ");
			int quantity = sc.nextInt();
			int dosa_price = 70;
			int cost = quantity * dosa_price;
			total_cost += cost;
			break;
			
			
		}
		case 2: {
			System.out.println("Enter Quantity : ");
			int quantity = sc.nextInt();
			int samosa_price = 10;
			int cost = quantity * samosa_price;
			total_cost += cost;
			break;
			
			
		}case 3: {
			System.out.println("Enter Quantity : ");
			int quantity = sc.nextInt();
			int idli_price = 30;
			int cost = quantity * idli_price;
			total_cost += cost;
			break;
			
			
		}case 4: {
			System.out.println("Enter Quantity : ");
			int quantity = sc.nextInt();
			int vadapav_price = 15;
			int cost = quantity * vadapav_price;
			total_cost += cost;
			break;
			
			
		}case 5: {
			System.out.println("Enter Quantity : ");
			int quantity = sc.nextInt();
			int pakoda_price = 20;
			int cost = quantity * pakoda_price;
			total_cost += cost;
			break;
			
			
		}case 6: {
			System.out.println("Enter Quantity : ");
			int quantity = sc.nextInt();
			int pavbhaji_price = 60;
			int cost = quantity * pavbhaji_price;
			total_cost += cost;
			break;
			
			
		}case 7: {
			System.out.println("Enter Quantity : ");
			int quantity = sc.nextInt();
			int paratha_price = 50;
			int cost = quantity * paratha_price;
			total_cost += cost;
			break;
			
			
		}case 8: {
			System.out.println("Enter Quantity : ");
			int quantity = sc.nextInt();
			int tea_price = 10;
			int cost = quantity * tea_price;
			total_cost += cost;
			break;
			
			
		}case 9: {
			System.out.println("Enter Quantity : ");
			int quantity = sc.nextInt();
			int coffee_price = 15;
			int cost = quantity * coffee_price;
			total_cost += cost;
			break;
			
			
		}case 10: {
			System.out.println("The total Bill = Rs "+total_cost);
			//System.exit(0);
//			break;
			return;
			
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + item);
		}
	}	
  }
}

