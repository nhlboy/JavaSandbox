package mct337.prc2;

import java.util.Scanner;

public class MCT337Prc2 {
public static void main(String[] args) {
        // Declare two double variables
        double Price;
        double Tax;
        // What if we want to READ the PRICE and 
        // TAX from th einput (user input)
        //Step 1: Create the Scanner Object
        Scanner sc = new Scanner(System.in);
        // Step 2: Read the PRICE
        System.out.print("enter the Price: ");
        Price = sc.nextDouble();
        // Step 3: read TAX
        System.out.print("enter the Tax: ");
        Tax = sc.nextDouble();
        //Use the SCANNER class
           
        
        // Calculate the price including tax 
        double Total = Price + (Price*Tax);
        
        // Display the result (total)
        System.out.println("Total is: "+Total);
            }
    
}
