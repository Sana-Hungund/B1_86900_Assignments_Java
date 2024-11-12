package question1.com.app.geometry;



public class Point2D {

	int x;
	int y;
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getDetails() {
		return "Point(" + this.x + "," +  this.y + ")";
		
	}

	
	public boolean isEqual(Point2D other) {
		if (this.x == other.x  && this.y == other.y){
			return true;
			
		} else {
			return false;
		}
	
	}
	public double calculateDistance(Point2D other) {
		double dist_x = other.x - this.x;
		double dist_y = other.y - this.y;
		double distance = Math.sqrt(Math.pow(dist_x, 2) +Math.pow(dist_y, 2));
		return distance;
	}
	

}
