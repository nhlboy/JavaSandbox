package tech.kitcorp;

/*R
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        int[] ints = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[10];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = reader.readLine();
        }

        //System.out.println(Arrays.toString(strings)); //выводим массив строк

        for (int a = 0; a < ints.length; a++) {
            ints[a] = strings[a].length();
        }

        for (int b = 0; b < ints.length; b++) {
            System.out.println(ints[b]);
        }



//        System.out.println(Arrays.toString(ints)); //выводим массив интов
    }
}


// 1. Создать массив на 10 строк.
// 2. Создать массив на 10 чисел.
// 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
// 4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

// Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.

// Требования:
// •	Программа должна создавать массив на 10 строк.
// •	Программа должна создавать массив на 10 целых чисел.
// •	Программа должна считывать строки для массива с клавиатуры.
// •	Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести на экран
