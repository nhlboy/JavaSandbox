package tech.kitcorp;

/*
Самые-самые
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<String> strings = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // заполняем ArrayList
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            strings.add(s);
        }

        System.out.println(strings);
        System.out.println();

        int max = strings.get(0).length();
        int min = strings.get(0).length();

        for (int j = 1; j < strings.size(); j++) {
            if (max < strings.get(j).length()) {
                max = strings.get(j).length();
            }
            if (min > strings.get(j).length())
                min = strings.get(j).length();
        }

        for (int k = 0; k < strings.size(); k++) {
            if ((strings.get(k).length() == max || strings.get(k).length() == min)) {
                System.out.println(strings.get(k));
                break;
            }
        }
    }
}
// 1. Создай список строк.
// 2. Добавь в него 10 строчек с клавиатуры.
// 3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
// Если таких строк несколько, то должны быть учтены самые первые из них.
// 4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
// Требования:

//     • Объяви переменную типа список строк и сразу проинициализируй ee.
//     • Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
//     • Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
//     • Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
//     • Должна быть выведена только одна строка.

//дедушка
//бабушка
//папа
//мама
//сын
//дочь
//коты
//сынДва
//дочьДва
//котыДва