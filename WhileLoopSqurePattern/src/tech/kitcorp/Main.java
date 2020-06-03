package tech.kitcorp;

/*
Гадание на долларовый счет
*/

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 10) {
            while (y < 10) {
                System.out.print("S");
                y++;
            }
            System.out.println();
            x++;
            y = 0;
        }
    }
}
// Вывести на экран квадрат из 10х10 букв S используя цикл while.
// Буквы в каждой строке не разделять.

// Пример вывода на экран:
// SSSSSSSSSS
// SSSSSSSSSS
// SSSSSSSSSS
// SSSSSSSSSS
// SSSSSSSSSS
// SSSSSSSSSS
// SSSSSSSSSS
// SSSSSSSSSS
// SSSSSSSSSS
// SSSSSSSSSS