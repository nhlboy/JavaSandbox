package tech.kitcorp;

import com.sun.security.jgss.GSSUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] populationArray = new int[15];

        for (int i = 0; i < populationArray.length; i++) {
            populationArray[i] = Integer.parseInt(reader.readLine());
        }

        int evenSum = 0;
        for(int i = 0; i < populationArray.length; i++) {
            if (i % 2 == 0) {
                evenSum +=  populationArray[i];
            }
        }

        int oddsSum = 0;
        for(int j = 0; j < populationArray.length; j++) {
            if (j % 2 != 0) {
                oddsSum += populationArray[j];
            }
        }

        System.out.println("нечетные: " + oddsSum);
        System.out.println("четные: " + evenSum);

        if (oddsSum > evenSum) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }
}

// 1. Создать массив на 15 целых чисел.
// 2. Ввести в него значения с клавиатуры.
// 3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
// Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
// 4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."

// Примечание:
// дом с порядковым номером 0 считать четным.
// Требования:

//     •
//     Программа должна создавать массив на 15 целых чисел.
//     •
//     Программа должна считывать числа для массива с клавиатуры.
//     •
//     Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.", если сумма нечетных элементов массива больше суммы четных.
//     •
//     Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.", если сумма четных элементов массива больше суммы нечетных.