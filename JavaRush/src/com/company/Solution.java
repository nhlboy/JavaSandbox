package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a1  = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();
        String d1 = reader.readLine();
        String e1 = reader.readLine();

        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        int d = Integer.parseInt(c1);
        int e = Integer.parseInt(c1);
    }



}

//Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
//
//        Пример ввода:
//        3
//        2
//        15
//        6
//        17
//
//        Пример вывода:
//        2
//        3
//        6
//        15
//        17
//// Требования:
//
////     •
////     Программа должна считывать 5 чисел с клавиатуры.
////     •
////     Программа должна выводить 5 чисел, каждое с новой строки.
////     •
////     Выведенные числа должны быть отсортированы по возрастанию.
////     •
////     Вывод должен содержать те же числа, что и были введены (порядок не важен).