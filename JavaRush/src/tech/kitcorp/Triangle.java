package tech.kitcorp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Triangle {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();

        int m = Integer.parseInt(number1); // string
        int n = Integer.parseInt(number2); // количество

        for (int i = 0; i >= m; i--) {
            for (int j = 0; j >=n; j--) {
                System.out.print(8);
            }
            System.out.println(" ");
        }
    }
}