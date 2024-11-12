class NegativeDiameterException extends Exception {
	public NegativeDiameterException() {
		super("the diameter can not be negative");
	}
}

public class Circle {

	private double myX;
	private double myY;
	private double myDiameter;

	public Circle() {
		this.myX = 0.0;
		this.myY = 0.0;
		this.myDiameter = 100.0;
	}

	public Circle(double x, double y, double diameter) throws NegativeDiameterException {
		this.myX = x;
		this.myY = y;
		setDiameter(diameter); // Using setter to enforce non-negative diameter
	}

	public double getMyX() {
		return myX;
	}

	public double getMyY() {
		return myY;
	}

	public double getDiameter() {
		return myDiameter;
	}

	public void setDiameter(double diameter) throws NegativeDiameterException {
		if (diameter < 0) {
			throw new NegativeDiameterException();
		}
		this.myDiameter = diameter;
	}


	
	@Override
	public String toString() {
		return "Circle [myX=" + myX + ", myY=" + myY + ", myDiameter=" + myDiameter + "]";
	}

	public static void main(String[] args) {
		try {
			Circle circle1 = new Circle(); 
			System.out.println(circle1.toString());

			Circle circle2 = new Circle(5.5, 6.5, 120); 
			System.out.println(circle2.toString());

			
			Circle circle3 = new Circle(3.0, 4.0, -50); 
			System.out.println(circle3.toString());
		} catch (NegativeDiameterException e) {
			System.out.println(e.getMessage());
		}
	}
}
