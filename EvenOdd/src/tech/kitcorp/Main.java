package tech.kitcorp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static int even = 0;
    public static int odd = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a  = reader.readLine();

        int number = Integer.parseInt(a);

        while (number != 0) {
            if (number % 2 != 0) {
                odd++;
            } else {
                even++;
            }
            number = number / 10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);

    }
}

// Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
// Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
// Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
// Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
// Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.

// Пример для числа 4445:
// Even: 3 Odd: 1
