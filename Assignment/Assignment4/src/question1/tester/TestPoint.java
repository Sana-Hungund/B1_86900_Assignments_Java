package question1.tester;
import java.util.Scanner;

import question1.com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		
		Point2D p1 = new Point2D(x1, y1);
		
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		Point2D p2 = new Point2D(x2, y2);
		
		System.out.println("details of point1 : " + p1.getDetails());
		System.out.println("details of point2 : " + p2.getDetails());
		
		if (p1.isEqual(p2)) {
			System.out.println("p1 and p2 are at same postion");
		}else {
			System.out.println(" p1 and p2 are at different postion");
		}

	}

}
