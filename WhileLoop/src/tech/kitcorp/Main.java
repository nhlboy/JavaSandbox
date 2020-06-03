package tech.kitcorp;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(333));
    }

    public static int sumDigitsInNumber(int number) {
        int lastDigit;
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}

// Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает
// целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

// Пример:
// Метод sumDigitsInNumber вызывается с параметром 546.

// Пример вывода:
// 15
