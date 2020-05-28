
import java.util.Scanner;

public class MCT337Prc3 {
public static void main(String[] args) {
        // Declare two double variables
        double lenth;
        double width;

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the Lenth: ");
        lenth = sc.nextDouble();

        System.out.print("enter the Width: ");
        width = sc.nextDouble();
        //Processing
        //p = 2 * (lenth + width);

        // Calculate the perimiter
        double P = 2 * (lenth + width);


        // Display the result (total)
        System.out.println("Perimiter is: "+2 * (lenth + width));
            }

}
