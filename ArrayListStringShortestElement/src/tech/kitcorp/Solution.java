package tech.kitcorp;

/*
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> strings = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // заполняем ArrayList
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }

        int min = strings.get(0).length();

        for (int i = 0; i < 5; i++) {
            if (min > strings.get(i).length()) {
                min = strings.get(i).length();
            }
        }

        for (int i = 0; i < 5; i++) {
            if (min == strings.get(i).length()) System.out.println(strings.get(i));
        }
    }
}

// 1. Создай список строк.
// 2. Считай с клавиатуры 5 строк и добавь в список.
// 3. Используя цикл, найди самую короткую строку в списке.
// 4. Выведи найденную строку на экран.
// 5. Если таких строк несколько, выведи каждую с новой строки.
// Требования:

//     •
//     Объяви переменную типа список строк и сразу проинициализируй ee.
//     •
//     Программа должна считывать 5 строк с клавиатуры и записывать их в список.
//     •
//     Программа должна выводить самую короткую строку на экран.
//     •
//     Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.