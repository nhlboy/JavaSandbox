package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[10];

        for (int i = 0; i < 8; i++) {
//            String s = reader.readLine();
            strings[i] = reader.readLine();

//            System.out.println(Arrays.toString(strings));
//            for (int s = 0; s < strings.length; s++)

        }
        for(int x = 9; x >= 0; x--)
            System.out.println(strings[x]);
//        System.out.println(strings[7]);
//        System.out.println(strings[6]);
//        System.out.println(strings[5]);
//        System.out.println(strings[4]);
//        System.out.println(strings[3]);
//        System.out.println(strings[2]);
//        System.out.println(strings[1]);
//        System.out.println(strings[0]);

    }
}

// 1. Создать массив на 10 строк.
// 2. Ввести с клавиатуры 8 строк и сохранить их в массив.
// 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
// Требования:

//     •
//     Программа должна создавать массив на 10 строк.
//     •
//     Программа должна считывать 8 строк для массива с клавиатуры.
//     •
//     Программа должна выводить на экран 10 строк, каждую с новой строки.
//     •
//     Программа должна выводить на экран массив (10 элементов) в обратном порядке.