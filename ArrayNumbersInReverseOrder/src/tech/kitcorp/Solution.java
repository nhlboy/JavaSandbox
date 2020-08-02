package tech.kitcorp;

/*
В убывающем порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {

        Arrays.sort(array);

        for (int j = 0; j < array.length / 2; j++) {
            // swap numbers
            int temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = temp;
        }
    }
}

// Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
// Требования:

//     •
//     Программа должна считывать 20 целых чисел с клавиатуры.
//     •
//     Программа должна выводить 20 чисел.
//     •
//     В классе Solution должен быть метод public static void sort(int[] array).
//     •
//     Метод main должен вызывать метод sort.
//     •
//     Метод sort должен сортировать переданный массив по убыванию.
