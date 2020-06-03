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

        if (a == b) {
            System.out.println("3");
        } else if (a == c) {
            System.out.println("2");
        } else if (b == c) {
            System.out.println("1");
        }
    }
}

// Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
// Вывести на экран порядковый номер числа, отличного от остальных.

// Пример для чисел 4 6 6:
// 1

// Пример для чисел 6 6 3:
// 3