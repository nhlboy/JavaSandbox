package tech.kitcorp;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        System.out.println(countWords("раз два три"));

        int[] array = {2,1,4,2,3};
        Arrays.stream(removeDuplicates(array)).forEach(System.out::println);

    }

    /**
     * @param s – Строка состоящая из букв латинского алфавита и пробелов
     * @return Количество слов в строке s
     */
    public static int countWords(String s) {
        int count = 0;
        if (s.length() != 0) {
            count++;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count;
        /**
         * @param a - оригинальный массив
         * @return массив, который не содержит дубликатов.
        Порядок элементов оригинального массива должен быть сохранён, из
        последовательности дубликатов оставлять первый, например, {2,1,4,2,3} -> {2,1,4,3}
         */

    }

    public static int[] removeDuplicates(int[] a) {
        return Arrays.stream(a).distinct().toArray();

//            int[] a = { 1, 1, 1, 2, 1, 3, 3 };

//            int n = a.length;
//            for (int i = 0, m = 0; i != n; i++, n = m) {
//                for (int j = m = i + 1; j != n; j++) {
//                    if (a[j] != a[i]) {
//                        if (m != j) a[m] = a[j];
//                        m++;
//                    }
//                }
//            }
//
//            if (n != a.length) {
//                int[] b = new int[n];
//                for (int i = 0; i < n; i++) b[i] = a[i];
//                a = b;
//            }
//            for (int x : a) System.out.print(x + " ");
//            System.out.println();

    }
}



