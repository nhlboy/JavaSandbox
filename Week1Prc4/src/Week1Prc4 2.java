import java.util.Scanner;

public class Week1Prc4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String name;
        String upperCaseName;


        System.out.print("Please enter your name: ");
        name = sc.nextLine();

        // convert user input into Upper Case
        upperCaseName = name.toUpperCase();


        System.out.println("Whats Up, " + upperCaseName + "!");

    }


}
