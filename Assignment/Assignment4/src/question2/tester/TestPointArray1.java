package question2.tester;
import java.util.Scanner;

import question1.com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of points to plot: ");
		int numPoints = sc.nextInt();
		
		Point2D[] points = new Point2D[numPoints];
		
		for(int i = 0; i< numPoints; i++) {
			System.out.println("Enetr point for point" + (i+1) );
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			points[i] = new Point2D(x1, y1);
			
			
		}
		
		int choice;
		do {
            System.out.println("\nMenu:");
            System.out.println("1. Display details of a specific point");
            System.out.println("2. Display x, y coordinates of all points");
            System.out.println("3. Display distance between two points");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    
                    System.out.print("Enter index of the point to display: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < numPoints) {
                        System.out.println("Point at index " + index + " is: " + points[index].getDetails());
                    } else {
                        System.out.println("Invalid index, please retry!!!!");
                    }
                    break;

                case 2:
                    System.out.println("All points:");
                    for (Point2D point : points) {
                        System.out.println(point.getDetails());
                    }
                    break;

                case 3:
                    System.out.print("Enter index of start point: ");
                    int startIndex = sc.nextInt();
                    System.out.print("Enter index of end point: ");
                    int endIndex = sc.nextInt();
                    
                    if (startIndex >= 0 && startIndex < numPoints && endIndex >= 0 && endIndex < numPoints) {
                        if (points[startIndex].isEqual(points[endIndex])) {
                        	System.out.println("The points are located at the same position.");
                           
                        } else {
                        	 double distance = points[startIndex].calculateDistance(points[endIndex]);
                             System.out.println("Distance between points " + startIndex + " and " + endIndex + " is: " + distance);
                            
                        }
                    } else {
                        System.out.println("Invalid indices, please retry");
                    }
                    break;

                case 4:
                    
                    System.out.println("Exiting program");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);
		
			
		

	}

}
