package tech.kitcorp;


/*
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Integer.parseInt(reader.readLine());
        }

//        System.out.println(Arrays.toString(myArray));

        for (int j = 9; j >= 0; j--) {
            System.out.println(myArray[j]);
        }
    }
}


// 1. Создать массив на 10 чисел.
// 2. Ввести с клавиатуры 10 чисел и записать их в массив.
// 3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
// Требования:

//     •
//     Программа должна создавать массив на 10 целых чисел.
//     •
//     Программа должна считывать числа для массива с клавиатуры.
//     •
//     Программа должна выводить 10 строчек, каждую с новой строки.
//     •
//     Массив должен быть выведен на экран в обратном порядке.
