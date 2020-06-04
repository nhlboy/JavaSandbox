package tech.kitcorp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Совершенствуем функциональность
*/

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }

    public static int min(int a, int b, int c, int d, int e) {
        int tempGroup = 0;
        int minimum = 0;
        int groupAB = Math.min(a, b);
        int groupCD = Math.min(c, d);

        if (groupAB < groupCD) {
            tempGroup = groupAB;
        } else {
            tempGroup = groupCD;
        }

        if (tempGroup < e) {
            minimum = tempGroup;
        } else {
            minimum = e;
        }
        return minimum;
    }
}

// Текущая реализация: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
// Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.