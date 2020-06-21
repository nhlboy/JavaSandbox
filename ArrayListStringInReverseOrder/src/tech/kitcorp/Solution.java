package tech.kitcorp;

/*
Слова в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }

        strings.remove(2);

        for (int j = 3; j > -1; j--) {
            System.out.println(strings.get(j));
        }
    }
}

// Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
// Требования:

//     •
//     Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
//     •
//     Считай 5 строк с клавиатуры и добавь их в список.
//     •
//     Удали третий элемент списка.
//     •
//     Выведи элементы на экран, каждый с новой строки.
//     •
//     Порядок вывода должен быть обратный.