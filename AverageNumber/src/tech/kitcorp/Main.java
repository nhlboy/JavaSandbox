package tech.kitcorp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Как-то средненько
*/

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number1 = reader.readLine();
        String number2 = reader.readLine();
        String number3 = reader.readLine();

        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);



        if (a > c && a < b) {
            System.out.println(a);
        } else if (a > b && a < c) {
            System.out.println(a);
        } else if (b > a && b < c) {
            System.out.println(b);
        } else if (b > c && b < a) {
            System.out.println(b);
        } else if (c > a && c < b ) {
            System.out.println(c);
        } else if ( c > b && c < a) {
            System.out.println(c);


        }
        if (a == b) {
            System.out.println(a);
        } else if (a == c) {
            System.out.println(a);
        } else if ( b == c) {
            System.out.println(b);
        } else if (a == b && b == c) {
            System.out.println(a);
        }
    }
}

// Ввести с клавиатуры три числа, вывести на экран среднее из них.
// Т.е. не самое большое и не самое маленькое.
// Если все числа равны, вывести любое из них.