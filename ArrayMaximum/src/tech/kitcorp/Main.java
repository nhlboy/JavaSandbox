package tech.kitcorp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        int[] array = initializeArray();
        int max = max(array);

        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[20];
        for (int i = 0; i < ints.length; i++) {
            String s = reader.readLine();
            ints[i] = Integer.parseInt(s);

        }
        return ints;
    }

    public static int max(int[] array) {
        Arrays.sort(array);
        return array[19];
    }
}

// 1. В методе initializeArray():
// 1.1. Создайте массив на 20 чисел
// 1.2. Считайте с консоли 20 чисел и заполните ими массив
// 2. Метод max(int[] array) должен находить максимальное число из элементов массивава