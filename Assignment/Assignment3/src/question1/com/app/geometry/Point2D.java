package question1.com.app.geometry;

public class Point2D {
	private double x;
    private double y;
    
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public String getDetails() {
        return "Point(" + x + ", " + y + ")";
    }
    
    public boolean isEqual(Point2D other) {
        return this.x == other.x && this.y == other.y;
    }
    public double calculateDistance(Point2D other) {
        double dx = other.x - this.x;
        double dy = other.y - this.y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
    
    

}