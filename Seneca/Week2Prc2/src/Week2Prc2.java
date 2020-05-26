import java.util.Scanner;

public class Week2Prc2 {

    public static void main(String[] args) {

        int x;

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        x = in.nextInt();

        if (x % 5 == 0) {

            System.out.println("HiFive!");
        }
        else {
            System.out.println("It is not divisible by 5");

        }

        if (x % 2 == 0) {

            System.out.print("HiEven!");
        }
        else {
            System.out.println("It is not divisible by 2");



        }
    }

}