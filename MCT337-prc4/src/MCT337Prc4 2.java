package mct337.prc4;

import java.util.Scanner;

public class MCT337Prc4 {
    public static void main(String[] args) {
        // Develop a program which promt user to enter
        // his/her name
        Scanner sc = new Scanner(System.in);
       
        //Then the program displays WELCOME NAME
        String Name = sc.nextLine();

        
        //like is user enter JOHN
        
        //the program displays WELCOME JOHN
                System.out.println("Welcome" +Name);
    }
    
}
