package week4;

import java.util.Date;

public class GeometricObject extends Object{
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	public GeometricObject() {
		System.out.println("Invoking Superclass Default Constructor");
		dateCreated = new Date();
	}
	
	public GeometricObject(String newColor, boolean newFilled) {
		dateCreated = new Date();
		color = newColor;
		filled = newFilled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String newColor) {
		color = newColor;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean newFilled) {
		filled = newFilled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public String toString() {
		return "color is " + color + ", filled is " + filled +
				", created on " + dateCreated;
	}
}