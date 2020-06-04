package tech.kitcorp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        double sum = 0;
        while (true) {
            String number = reader.readLine();
            int x = Integer.parseInt(number);
            count++;
            sum += x;
            if (x == -1) {
                break;
            }
        }
        System.out.println((sum + 1)/(count - 1));
    }
}

// Вводить с клавиатуры числа и вычислить среднее арифметическое.
// Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
// -1 не должно учитываться.

// Примеры:
// а) при вводе чисел
// 1
// 2
// 2
// 4
// 5
// -1
// получим вывод
// 2.8

// б) при вводе чисел
// 4
// 3
// 2
// 1
// -1
// получим вывод
// 2.5

// Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

// while (true) {
//     int number = считываем число;
//     if (проверяем, что number -1)
//         break;
// }