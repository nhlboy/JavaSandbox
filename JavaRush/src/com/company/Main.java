package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        String number = scanner.nextLine(); // Read user input

        int day = Integer.parseInt(number); //преобразовываем строку в число.
        scanner.close();

            switch(day) {
                case 1:
                    System.out.println("понедельник");
                    break;
                case 2:
                    System.out.println("вторник");
                    break;
                case 3:
                    System.out.println("среда");
                    break;
                case 4:
                    System.out.println("четверг");
                    break;
                case 5:
                    System.out.println("пятница");
                    break;
                case 6:
                    System.out.println("суббота");
                    break;
                case 7:
                    System.out.println("воскресенье");
                    break;
                default:
                    System.out.println("такого дня недели не существует");
                    break;
            }

        }

    }


//    Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
//        "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
//        если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".
//
//        Пример для номера 5:
//        пятница
//
//        Пример для номера 10:
//        такого дня недели не существует
//        Требования:
//        •	Программа должна считывать число c клавиатуры.
//        •	Программа должна выводить текст на экран.
//        •	Если введено число от 1 до 7, необходимо вывести день недели.
//        •	Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.