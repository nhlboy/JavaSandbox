package tech.kitcorp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        String number3 = reader.readLine();

        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);

        if (a <= b &&  b <= c) {
            System.out.println(c + " " + b + " " + a);
            //bac
        } else if (b <= a && a <= c) {
            System.out.println(c + " " + a + " " + b);
            //cba
        } else if (c <= b && b <= a) {
            System.out.println(a + " " + b + " " + c);
            //acb
        } else if (a <= c && c <= b) {
            System.out.println(b + " " + c + " " + a);
            //bca
        } else if (b <= c && c <= a) {
            System.out.println(a + " " + c + " " + b);
            //cab
        } else if (c <= a && a <= b) {
            System.out.println(b + " " + a + " " + c);
        }
    }
}

// Ввести с клавиатуры три числа, и вывести их в порядке убывания.
// Выведенные числа должны быть разделены пробелом.