package tech.kitcorp;

/*
Играем в Jолушку
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> mainList = new ArrayList<Integer>();
        ArrayList<Integer> moduloThreeList = new ArrayList<Integer>();
        ArrayList<Integer> moduloTwoList = new ArrayList<Integer>();
        ArrayList<Integer> allTheRestList = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            String s  = reader.readLine();
            int x = Integer.parseInt(s);
                mainList.add(x);

                if (x % 3 == 0) {
                    moduloThreeList.add(x);
                }
                if (x % 2 == 0) {
                    moduloTwoList.add(x);
                } else {
                    allTheRestList.add(x);
                }
            }

        printList(moduloThreeList);
        printList(moduloTwoList);
        printList(allTheRestList);


//        System.out.println(mainList);
//        System.out.println(moduloThreeList);
//        System.out.println(moduloTwoList);
//        System.out.println(allTheRestList);
    }


    public static void printList(ArrayList<Integer> list) {
        for(int e = 0; e < list.size(); e++)
        System.out.println(list.get(e));
    }
}
// 1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
// Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
// Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
// Порядок объявления списков очень важен.

// 2. Метод printList должен выводить на экран все элементы списка с новой строки.
// 3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
// Требования:

//     •
//     Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел). Первый список будет главным, а остальные - дополнительными.
//     •
//     Считать 20 чисел с клавиатуры и добавить их в главный список.
//     •
//     Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
//     •
//     Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
//     •
//     Добавить в третий дополнительный список все остальные числа из главного.
//     •
//     Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
//     •
//     Программа должна вывести три дополнительных списка, используя метод printList.