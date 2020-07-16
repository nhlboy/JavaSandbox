package tech.kitcorp;


/*
Удваиваем слова
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (int p = 0; p < list.size(); p++) {
            System.out.println(list.get(p));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            list.add(i, list.get(i));
        }
        return list;
    }
}


// 1. Введи с клавиатуры 10 слов в список строк.

// 2. Метод doubleValues должен удваивать слова по принципу:
// "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"

// 3. Выведи результат на экран, каждое значение с новой строки.

// Требования:
// •	Объяви переменную типа список строк и сразу проинициализируй ee.
// •	Считай 10 строк с клавиатуры и добавь их в список.
// •	Метод doubleValues должен удваивать элементы списка по принципу "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
// •	Выведи получившийся список на экран, каждый элемент с новой строки.
