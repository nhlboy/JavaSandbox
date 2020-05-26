import java.util.Scanner;

class CircleApp {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("c1's radius is " + c1.radius);
        System.out.println("c1's color is " + Circle.color);
        System.out.println();

        Circle c2 = new Circle(10);
        System.out.println("c2's radius is " + c2.radius);
        System.out.println("c2's color is " + Circle.color);
        Circle.color = "Blue";
        System.out.println("c2's color is changed to " + Circle.color);
        System.out.println(Circle.color);
        c2.setRadius(20);
        System.out.println("c2's radius is changed to " + c2.radius);
        double a = c2.getArea();
        System.out.println("c2's area is " + a);
        System.out.println();


        Scanner input = new Scanner(System.in);
        System.out.print("Please enter radius of your circle: ");
        double r = input.nextDouble();
        Circle c3 = new Circle(r);
        System.out.println("c3's radius is " + c3.radius);
        System.out.println();

        System.out.print("Please enter an integer number: ");
        int n = input.nextInt();
        int square = Circle.squareFn(n);
        System.out.println(n + "^2 = " + square);


    }

}
