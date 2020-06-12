package tech.kitcorp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    private static ArrayList<Integer> stringSizes = new ArrayList<Integer>();

    public static void main(String[] args) throws Exception {

        strings = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // заполняем ArrayList
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }

        int max = strings.get(0).length();

        for (int i = 0; i < 5; i++) {
            if (max < strings.get(i).length()) {
                max = strings.get(i).length();
            }
        }

        for (int i = 0; i < 5; i++) {
            if (max == strings.get(i).length()) System.out.println(strings.get(i));
        }
    }
}


// 1. Создай список строк.
// 2. Считай с клавиатуры 5 строк и добавь в список.

// 3. Используя цикл, найди самую длинную строку в списке.
// 4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

// Требования:
// •	В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
// •	Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
// •	Программа должна выводить самую длинную строку на экран.
// •	Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.

//    дедушка
//    бабушка
//    дочь
//    программа
//    машина