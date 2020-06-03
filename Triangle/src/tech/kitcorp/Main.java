package tech.kitcorp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        String sideA = scanner.nextLine(); // Read user input
        String sideB = scanner.nextLine(); // Read user input
        String sideC = scanner.nextLine(); // Read user input

        int a = Integer.parseInt(sideA); //преобразовываем строку в число.
        int b = Integer.parseInt(sideB); //преобразовываем строку в число.
        int c = Integer.parseInt(sideC); //преобразовываем строку в число.

        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("Треугольник не существует.");
        } else {
            System.out.println("Треугольник существует.");
        }
        scanner.close();
    }
}

// вести с клавиатуры три числа а, b, c - стороны предполагаемого треугольника.
// Определить возможность существования треугольника по сторонам.
// Результат вывести на экран в следующем виде:
// "Треугольник существует." - если треугольник с такими сторонами существует.
// "Треугольник не существует." - если треугольник с такими сторонами не существует.

// Подсказка:
// Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
// Требуется сравнить каждую сторону с суммой двух других.
// Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других, то треугольника с такими сторонами не существует.