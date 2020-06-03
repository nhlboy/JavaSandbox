package tech.kitcorp;

/*
Таблица умножения
*/

public class Main {
    public static void main(String[] args) {
        int row1 = 0;
        int row2 = 0;
        int row3 = 0;
        int row4 = 0;
        int row5 = 0;
        int row6 = 0;
        int row7 = 0;
        int row8 = 0;
        int row9 = 0;
        int row10 = 0;

        while (row1 < 10) {
            row1++;
            System.out.print(" " + row1);
        }

        System.out.println();
        while (row2 < 20) {
            row2 +=2;
            System.out.print(" " + row2);
        }

        System.out.println();
        while (row3 < 30) {
            row3 +=3;
            System.out.print(" " + row3);
        }

        System.out.println();
        while (row4 < 40) {
            row4 +=4;
            System.out.print(" " + row4);
        }

        System.out.println();
        while (row5 < 50) {
            row5 +=5;
            System.out.print(" " + row5);
        }

        System.out.println();
        while (row6 < 60) {
            row6 +=6;
            System.out.print(" " + row6);
        }

        System.out.println();
        while (row7 < 70) {
            row7 +=7;
            System.out.print(" " + row7);
        }

        System.out.println();
        while (row8 < 80) {
            row8 +=8;
            System.out.print(" " + row8);
        }

        System.out.println();
        while (row9 < 90) {
            row9 +=9;
            System.out.print(" " + row9);
        }

        System.out.println();
        while (row10 < 100) {
            row10 +=10;
            System.out.print(" " + row10);
        }
    }
}

// Вывести на экран таблицу умножения 10х10 используя цикл while.
// Числа разделить пробелом.

// Пример вывода на экран:
// 1 2 3 4 5 6 7 8 9 10
// 2 4 6 8 10 12 14 16 18 20
// 3 6 9 12 15 18 21 24 27 30
// 4 8 12 16 20 24 28 32 36 40
// 5 10 15 20 25 30 35 40 45 50
// 6 12 18 24 30 36 42 48 54 60
// 7 14 21 28 35 42 49 56 63 70
// 8 16 24 32 40 48 56 64 72 80
// 9 18 27 36 45 54 63 72 81 90
// 10 20 30 40 50 60 70 80 90 100