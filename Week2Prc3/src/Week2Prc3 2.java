import java.util.Scanner;

public class Week2Prc3 {

    public static void main(String[] args) {

        String pass;

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the PASSWORD: ");
        pass = in.nextLine();

        if (pass.equals("admin"))

            System.out.print("Login is Successful");
        else
            System.out.println("Wrong Password");



    }
}