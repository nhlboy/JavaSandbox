package tech.kitcorp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        String number3 = reader.readLine();
        String number4 = reader.readLine();

        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);
        int d = Integer.parseInt(number4);

        if (a == d && b == d && c == d) {
            System.out.println(a);
        } else {
            int x = Math.max(a, b);
            int y = Math.max(c, d);
            System.out.println(Math.max(x, y));
        }
    }
}

// Ввести с клавиатуры четыре числа, и вывести максимальное из них.
// Если числа равны между собой, необходимо вывести любое.