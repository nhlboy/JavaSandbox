import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");

        boolean hasNexInt = scanner.hasNextInt();

        if(hasNexInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line chracter (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2019 - yearOfBirth;

            if(age >= 0 && age <= 100) {
                System.out.println("You name is " + name + ", and you are " +age + " years old.");
            }
            else {
                System.out.println("Ебушки ворубушки! Fuck you, " + name);
            }

        } else {
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close();

    }
}
