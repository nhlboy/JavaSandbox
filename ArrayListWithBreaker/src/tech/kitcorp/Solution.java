package tech.kitcorp;

/*
Это конец
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> myStrings = new ArrayList<String>();

        for (int i = 0; ; i++ ){
            myStrings.add(reader.readLine());
            if (myStrings.get(i).equals("end")) {
                myStrings.remove("end");
                break;
            }
        }

        for (int i = 0; i < myStrings.size(); i++){
            System.out.println(myStrings.get(i));
        }
    }
}

// Создать список строк.
// Ввести строки с клавиатуры и добавить их в список.
// Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
// Вывести строки на экран, каждую с новой строки.
// Требования:

//     •
//     Объяви переменную типа список строк и сразу проинициализируй ee.
//     •
//     Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку "end".
//     •
//     Саму строку "end" не нужно добавлять в список.
//     •
//     Выведи список на экран, каждое значение с новой строки.
//     •
//     Используй цикл for.