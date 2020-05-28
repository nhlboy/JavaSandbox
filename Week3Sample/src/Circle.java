class Circle {
    double radius = 1;
    static String color = "White";

    Circle () {

    }

    Circle (double newRadius) {

        radius = newRadius;
    }

    double getArea() {

        return radius * radius * 3.14;
    }

    double getPerimeter() {

        return 2 * radius * 3.14;
    }

    void setRadius(double newRadius) {

        radius = newRadius;
    }

    static int squareFn(int num) {

        return num * num;
    }
}
