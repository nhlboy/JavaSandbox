package tech.kitcorp;

/*
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> stringArrayList = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // заполняем ArrayList
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            stringArrayList.add(s);
        }


        for (int j = 0; j < 13; j++) {
//            System.out.println("initial List: " + stringArrayList);
            String tempString = stringArrayList.get(4);
//            System.out.println("last element is: " + tempString);
            stringArrayList.remove(4);
            stringArrayList.add(0, tempString);
//            System.out.println("Updated List: " + stringArrayList);
            //  System.out.println(stringArrayList);
        }

        for (int w = 0; w < 5; w++) {
            System.out.println(stringArrayList.get(w));

            //System.out.println(stringArrayList.get(4));
        }
    }
}

// 1. Создай список строк.
// 2. Добавь в него 5 строк с клавиатуры.
// 3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
// 4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
// Требования:

//     •
//     Объяви переменную типа список строк и сразу проинициализируй ee.
//     •
//     Программа должна считывать 5 строк с клавиатуры.
//     •
//     Удали последнюю строку и вставь её в начало. Повторить 13 раз.
//     •
//     Программа должна выводить список на экран, каждое значение с новой строки.