package tech.kitcorp;

/*
Продолжаем мыть раму
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("мама");
        strings.add("именно");
        strings.add("мыла");
        strings.add("именно");
        strings.add("раму");
        strings.add("именно");

        for(int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}

// 1. Создай список из слов "мама", "мыла", "раму".
// 2. После каждого слова вставь в список строку, содержащую слово "именно".
// 3. Вывести результат на экран, каждый элемент списка с новой строки.
// Требования:

//     •
//     Программа не должна считывать данные с клавиатуры.
//     •
//     Объяви переменную типа список строк и сразу проинициализируй ee.
//     •
//     Добавь в список слова: «мама», «мыла», «раму».
//     •
//     После каждого слова добавь в список строку, содержащую слово «именно».
//     •
//     Выведи элементы списка на экран, каждый с новой строки.