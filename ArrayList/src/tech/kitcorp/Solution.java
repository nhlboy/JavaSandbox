package tech.kitcorp;

/*
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> listStrings = new ArrayList<String>();

        listStrings.add("Kirill");
        listStrings.add("Tanya");
        listStrings.add("Daniel");
        listStrings.add("Timurka");
        listStrings.add("Haus");

        System.out.println(listStrings.size());

        for(int i = 0; i < listStrings.size(); i++) {
            System.out.println(listStrings.get(i));
        }

    }
}

// 1. Создай список строк.
// 2. Добавь в него 5 различных строк.
// 3. Выведи его размер на экран.
// 4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.

// Требования:
// •	Программа не должна ничего считывать с клавиатуры.
// •	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
// •	Программа должна добавить 5 любых строк в список.
// •	Программа должна вывести размер списка на экран.
// •	Программа должна вывести содержимое списка на экран, каждое значение с новой строки.