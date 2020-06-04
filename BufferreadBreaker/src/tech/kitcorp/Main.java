package tech.kitcorp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Суммирование
*/

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        while (true) {
            String number = reader.readLine();
            int intNUmber = Integer.parseInt(number);
            sum += intNUmber;
            if (intNUmber == -1)
                break;
        }
        System.out.println(sum);
    }
}

// Вводить с клавиатуры числа.
// Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
// -1 должно учитываться в сумме.

// Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

// while (true) {
//     int number = считываем число;
//     if (проверяем, что number -1)
//         break;
// }