public class Exercise1Q3 {

    public static void main(String[] args) {
        Double Area, Perimeter, Width, Height;

        Width = 4.5;
        Height = 7.9;
        Area = Width * Height;
        Perimeter = 2 * (Width + Height);

        double roundArea = Math.round(Area*100.0)/100.0;
        double roundPerimeter = Math.round(Perimeter*100.0)/100.0;

        System.out.println("Width: " +Width);
        System.out.println("Height: " +Height);
        System.out.println("------------");
        System.out.println("Area is: " +roundArea);
        System.out.println("Perimeter: " +roundPerimeter);


    }
}



