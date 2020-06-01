package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayMaxElement {
    public static void main(String[] args) throws Exception {

        int[] array = initializeArray();
        int max = max(array);

        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[20];
        for (int i = 0; i < ints.length; i++) {
            String s = reader.readLine();
            ints[i] = Integer.parseInt(s);

        }
        return ints;
    }

    public static int max(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        return array[19];
    }
}

// 1. В методе initializeArray():
// 1.1. Создайте массив на 20 чисел
// 1.2. Считайте с консоли 20 чисел и заполните ими массив

// 2. Метод max(int[] array) должен находить максимальное число из элементов массива
// Требования:

//     •
//     Метод initializeArray должен создавать массив из 20 целых чисел.
//     •
//     Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
//     •
//     Метод max должен возвращать максимальный элемент из переданного массива.
//     •
//     Метод main изменять нельзя.
