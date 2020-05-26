package academy.learnprogramming;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        area(5.0);
        area(-1.0, 4.0);
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            System.out.println(radius * radius * Math.PI);
            return radius * radius * Math.PI;

        }
    }

    public static double area(double x, double y){
        if ((x < 0) | (y < 0)) {
            return -1.0;
        } else {
            System.out.println(x * y);
            return x * y;
        }
    }
}
