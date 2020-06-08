package tech.kitcorp;

/*
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] bigTwenty = new int[20];

        for (int i = 0; i < bigTwenty.length; i++) {
            bigTwenty[i] = Integer.parseInt(reader.readLine());
        }

        int[] littleTenOne = new int[10];

        System.arraycopy(bigTwenty, 0, littleTenOne, 0, 10);
//        System.out.println(Arrays.toString(littleTenOne));


        int[] littleTenTwo = new int[10];

        System.arraycopy(bigTwenty, 10, littleTenTwo, 0, 10);
//        System.out.println(Arrays.toString(littleTenTwo));

        for (int i = 0; i < littleTenOne.length; i++) {
            System.out.println(littleTenTwo[i]);
        }
    }
}


// 1. Создать массив на 20 чисел.
// 2. Ввести в него значения с клавиатуры.
// 3. Создать два массива на 10 чисел каждый.
// 4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
// 5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
// Требования:

//     •
//     Программа должна создавать большой массив на 20 целых чисел.
//     •
//     Программа должна считывать с клавиатуры 20 чисел для большого массива.
//     •
//     Программа должна создавать два маленьких массива на 10 чисел каждый.
//     •
//     Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести второй маленький массив на экран.