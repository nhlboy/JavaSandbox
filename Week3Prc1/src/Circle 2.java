public class Circle {
    /** The radius of this circle */
    double radius = 1;

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
