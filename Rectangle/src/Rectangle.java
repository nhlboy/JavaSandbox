// Create a class called Rectangle with following feautures:
// data field called height with double type

// data field called width with double type.
// static data field called filled wth boolean type
// static data field called color with String type
// defult Constructor
// Constructor to specify height and width
// Constructor to specify height, width, filled and color
// 4 getter methods to return height, width, filled and color, separately
// 4 setter method to set height, width, filled and color, separately
// getArea and getPerimiter methods to return area and perimeter separately
// printRectangle method that prints the information of the object including height, width, filled, color area and perimeter
//
// to test program to promt user to enetr height, width, filled and color. Tham create a Rectangle object with antered valus and use printRectangle to print the information of the object

public class Rectangle {

    double height = 1;
    static String color = "White";

    //** Construct a circle object */
    Circle() {
    }

    //** Construct a circle object */
    Circle(double newRadius) {
        radius = newRadius;
    }

    /** Return thearea of this circle */
    double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return the perimeter of this circle */
    double getPerimiter() {
        return 2 * radius * Math.PI;
    }

    /** Set a new radius for this circle */
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
