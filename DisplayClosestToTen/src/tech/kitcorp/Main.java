package tech.kitcorp;

/*
Ближайшее к 10
*/

public class Main {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int testA = 10 - a;
        int testB = 10 - b;

        if(abs(testA) < abs(testB)) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
// Напишите метод displayClosestToTen. Метод должен выводить на экран ближайшее
// к 10 из двух чисел, записанных в аргументах метода.
// Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10,
// то вывести на экран любое из них.