package question1.tester;
import question1.com.app.geometry.Point2D;
import java.util.Scanner;
public class TestPoint {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter x coordinate of Point 1: ");
    double x1 = scanner.nextDouble();
    System.out.print("Enter y coordinate of Point 1: ");
    double y1 = scanner.nextDouble();

     
    Point2D p1 = new Point2D(x1, y1);

     
    System.out.print("Enter x coordinate of Point 2: ");
    double x2 = scanner.nextDouble();
    System.out.print("Enter y coordinate of Point 2: ");
    double y2 = scanner.nextDouble();

     
    Point2D p2 = new Point2D(x2, y2);

     
    System.out.println("Details of Point 1: " + p1.getDetails());
    System.out.println("Details of Point 2: " + p2.getDetails());

     
     if (p1.isEqual(p2)) {
         System.out.println("Both points are at the same position.");
     } else {
         System.out.println("The points are at different positions.");
         
         double distance = p1.calculateDistance(p2);
         System.out.println("Distance between Point 1 and Point 2: " + distance);
     }

    
     scanner.close();

        
       

	}
}