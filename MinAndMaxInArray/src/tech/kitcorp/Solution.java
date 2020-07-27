package tech.kitcorp;


/*
Минимаксы в массивах
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {

        int maximum;
        int minimum;
        int[] myNumbers = getInts();

        Arrays.sort(myNumbers);
        maximum = myNumbers[19];
        minimum = myNumbers[0];

        System.out.print(maximum + " " + minimum);
    }

        static public int[] getInts() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int[] getNums = new int[20];
            for (int i = 0; i < 20; i++) {
                getNums[i] = Integer.parseInt(reader.readLine());
            }
            return getNums;
        }
    }

// Создать массив на 20 чисел.
// Заполнить его числами с клавиатуры.
// Найти максимальное и минимальное числа в массиве.
// Вывести на экран максимальное и минимальное числа через пробел.
// Требования:

//     • В классе Solution создай статический публичный метод int[] getInts().
//     • Метод getInts() должен возвращать массив целых чисел размерностью 20 элементов, заполненный с клавиатуры.
//     • В методе main создай и проициализируй массив с помощью метода getInts(), найди и выведи через пробел максимальный и минимальный элемент массива.
//     • Используй цикл for.
