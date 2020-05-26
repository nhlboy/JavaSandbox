package week4;

public class Circle extends GeometricObject {
	private double radius = 1.0;
	
	public Circle() {
		
	}
	
	public Circle(double newRadius) {
		super("blue", false);
//		super();
		radius = newRadius;
//		super("blue", false);
	}
	
	public Circle(double newRadius, String newColor, boolean newFilled) {
		radius = newRadius;
		setColor(newColor);
		setFilled(newFilled);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public void printCircle() {
		System.out.println("color is " + getColor() + ", filled is " + isFilled() +
				", created on " + getDateCreated() +
				", radius is " + radius);
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		System.out.println(c1.getRadius());
		System.out.println(c1.getColor());
	}
}

