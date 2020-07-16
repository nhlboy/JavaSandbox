package tech.kitcorp;

/*
Вывести числа в обратном порядке
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> myNums = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            int a = Integer.parseInt(s);
            myNums.add(a);

        }

        for (int j = 9; j > -1; j-- ) {
            System.out.println(myNums.get(j));
        }

    }
}

// Ввести с клавиатуры 10 чисел и заполнить ими список.

// Вывести их в обратном порядке. Каждый элемент - с новой строки.
// Использовать только цикл for.

// Подсказка:
// Не забудь импортировать класс: java.util.ArrayList;
// Требования:

//     •
//     Объяви переменную типа список целых чисел и сразу проинициализируй ee.
//     •
//     Считай 10 целых чисел с клавиатуры и добавь их в список.
//     •
//     Выведи числа в обратном порядке.
//     •
//     Используй цикл for.