package tech.kitcorp;

/*
Перестановочка подоспела
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sN = reader.readLine();
        String sM = reader.readLine();

        int n = Integer.parseInt(sN);
        int m = Integer.parseInt(sM);

        ArrayList<String> myStrings = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            String s = reader.readLine();
            myStrings.add(s);
        }

        for (int j = 0; j < m; j++) {
            String element = myStrings.get(0);
            myStrings.add(element);
            myStrings.remove(0);
        }

        for (int k = 0; k < myStrings.size(); k++) {
            System.out.println(myStrings.get(k));
        }
    }
}

// Ввести с клавиатуры 2 числа N и M.

// Ввести N строк и заполнить ими список.

// Переставить M первых строк в конец списка.
// Вывести список на экран, каждое значение с новой строки.

// Примечание: запрещено создавать больше одного списка.
// Требования:

//     •
//     Объяви переменную типа список строк и сразу проинициализируй ee.
//     •
//     Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
//     •
//     Переставить M первых строк в конец списка.
//     •
//     Выведи список на экран, каждое значение с новой строки.

//папа
//мама
//сын
//дочь
//коты
//собака
//программа
//машина